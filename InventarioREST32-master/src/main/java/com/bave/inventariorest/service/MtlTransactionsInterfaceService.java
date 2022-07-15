package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlTransactionsInterfaceDao;
import com.bave.inventariorest.model.DatosTransOrg;
import com.bave.inventariorest.model.DatosTransOrgDetalle;
import com.bave.inventariorest.model.MtlTransactionsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.List;

@Service
public class MtlTransactionsInterfaceService {

    @Autowired
    private IMtlTransactionsInterfaceDao iMtlTransactionsInterfaceDao;

    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<DatosTransOrg> getTransSubinv() {

        Query query = entityManager.createQuery(
                "SELECT DISTINCT new com.bave.inventariorest.model.DatosTransOrg(mti.shipmentNumber,mti.transactionSourceName) FROM MtlTransactionsInterface mti WHERE mti.transactionActionId=21 and mti.transactionTypeId=21 and exists (select  1 from MtlStatusNew msn where mti.organizationId = msn.organizationId and msn.shipmentNumber = mti.shipmentNumber and msn.processFlag = 30)",
                DatosTransOrg.class);
        try {
            return query.getResultList();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<DatosTransOrgDetalle> getTransferencias(String transactionReference) {

        Query query = entityManager.createQuery(
                "SELECT new com.bave.inventariorest.model.DatosTransOrgDetalle(msi.segment1,mti.subinventoryCode,mti.transactionInterfaceId,(SELECT loc.codLocalizador FROM Localizador loc where loc.idLocalizador=mti.locatorId),(SELECT org.code FROM Organizacion org WHERE org.idOrganizacion=mti.transferOrganization and org.transferencia='HACIA'),mti.transactionQuantity) FROM MtlTransactionsInterface  mti, MtlSystemItems msi WHERE mti.inventoryItemId=msi.inventoryItemId and mti.shipmentNumber=?1",
                DatosTransOrgDetalle.class);

        try {
            return (List<DatosTransOrgDetalle>) query.setParameter(1, transactionReference).getResultList();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional
    public void insert(MtlTransactionsInterface mtlTransactionsInterface) {

        iMtlTransactionsInterfaceDao.save(mtlTransactionsInterface);

    }

    @Transactional(readOnly = true)
    public Long getLocOrDesNotNull(Long inventoryItemId, String subinventario, String localizador,
            String transferSubinventory, String transferLocator) {

        Query query = entityManager.createNativeQuery(" select count(*) from mtl_transactions_interface mti, " +
                "localizador loc, localizador loc_des " +
                "where mti.locator_id = loc.id_localizador " +
                "and mti.transfer_locator = loc_des.id_localizador " +
                "and mti.inventory_item_id = ?1 " +
                "and mti.subinventory_code = ?2 " +
                "and loc.cod_localizador = ?3 " +
                "and mti.transfer_subinventory = ?4 " +
                "and loc_des.cod_localizador = ?5 ");

        try {
            return (Long) query.setParameter(1, inventoryItemId)
                    .setParameter(2, subinventario)
                    .setParameter(3, localizador)
                    .setParameter(4, transferSubinventory)
                    .setParameter(5, transferLocator).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }
    }

    @Transactional(readOnly = true)
    public Long getLocOrNullDestNotNull(Long inventoryItemId, String subinventario, String transferSubinventory,
            String transferLocator) {

        Query query = entityManager.createNativeQuery(" select count(*) from mtl_transactions_interface mti, " +
                "localizador loc_des " +
                "where mti.transfer_locator = loc_des.id_localizador " +
                "and mti.inventory_item_id = ?1 " +
                "and mti.subinventory_code = ?2 " +
                "and mti.transfer_subinventory = ?3 " +
                "and loc_des.cod_localizador = ?4 ");

        try {
            return (Long) query.setParameter(1, inventoryItemId)
                    .setParameter(2, subinventario)
                    .setParameter(3, transferSubinventory)
                    .setParameter(4, transferLocator).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public Long getLocOrNotNullDestNull(Long inventoryItemId, String subinventario, String localizador,
            String transferSubinventory) {

        Query query = entityManager.createNativeQuery(" select count(*) from mtl_transactions_interface mti, " +
                "localizador loc " +
                "where mti.locator_id = loc.id_localizador " +
                "and mti.inventory_item_id = ?1 " +
                "and mti.subinventory_code = ?2 " +
                "and loc.cod_localizador = ?3 " +
                "and mti.transfer_subinventory = ?4");

        try {
            return (Long) query.setParameter(1, inventoryItemId)
                    .setParameter(2, subinventario)
                    .setParameter(3, localizador)
                    .setParameter(4, transferSubinventory).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }
    }

    @Transactional(readOnly = true)
    public Long getLocOrNullDestNull(Long inventoryItemId, String subinventario, String transferSubinventory) {

        Query query = entityManager.createNativeQuery(" select count(*) from mtl_transactions_interface " +
                "where inventory_item_id = ?1 " +
                "and subinventory_code = ?2 " +
                "and transfer_subinventory = ?3 and locator_id IS NULL and transfer_locator IS NULL");

        try {
            return (Long) query.setParameter(1, inventoryItemId)
                    .setParameter(2, subinventario)
                    .setParameter(3, transferSubinventory).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public Long getLocOrDesNotNullOrg(Long inventoryItemId, String subinventario, String localizador,
            Long organizacionDestino) {

        Query query = entityManager.createNativeQuery(" select count(*) from mtl_transactions_interface mti, " +
                "localizador loc " +
                "where mti.locator_id = loc.id_localizador " +
                "and mti.inventory_item_id = ?1 " +
                "and mti.subinventory_code = ?2 " +
                "and loc.cod_localizador = ?3 " +
                "and mti.transfer_organization = ?4 ");

        try {

            BigDecimal a = (BigDecimal) (query.setParameter(1, inventoryItemId)
                    .setParameter(2, subinventario)
                    .setParameter(3, localizador)
                    .setParameter(4, organizacionDestino).getSingleResult());

            return a.longValue();

        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public Long getLocOrNullDestNotNullOrg(Long inventoryItemId, String subinventario, Long organizacionDestino) {

        Query query = entityManager.createNativeQuery(" select count(*) from mtl_transactions_interface mti " +
                "where mti.inventory_item_id = ?1 " +
                "and mti.subinventory_code = ?2 " +
                "and mti.transfer_organization = ?3 ");

        try {

            BigDecimal a = (BigDecimal) (query.setParameter(1, inventoryItemId)
                    .setParameter(2, subinventario)
                    .setParameter(3, organizacionDestino).getSingleResult());

            return a.longValue();

        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public Long getLocNull(Long inventoryItemId, String subinventario, String localizador) {

        Query query = entityManager.createNativeQuery("select count(*) from mtl_transactions_interface mti, " +
                "localizador loc " +
                "where mti.locator_id = loc.id_localizador " +
                "and mti.inventory_item_id = ?1 " +
                "and mti.subinventory_code = ?2 " +
                "and nvl(loc.cod_localizador, '') = ?3");

        try {
            return (Long) query.setParameter(1, inventoryItemId)
                    .setParameter(2, subinventario)
                    .setParameter(3, localizador).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<MtlTransactionsInterface> getTransferencias(String numeroTraspaso, String glosa) {

        Query query = entityManager.createNativeQuery(
                "select * from mtl_transactions_interface mti where mti.TRANSACTION_REFERENCE=?1 and mti.TRANSACTION_SOURCE_NAME=?2 ");
        try {

            return (List<MtlTransactionsInterface>) query.setParameter(1, numeroTraspaso)
                    .setParameter(2, glosa)
                    .getResultList();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<MtlTransactionsInterface> getTransferenciasByTraspaso(String numeroTraspaso) {

        Query query = entityManager
                .createNativeQuery("select * from mtl_transactions_interface mti where mti.TRANSACTION_REFERENCE=?1 ");

        try {

            return (List<MtlTransactionsInterface>) query.setParameter(1, numeroTraspaso)
                    .getResultList();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<MtlTransactionsInterface> getTransferenciasByShipment(String numeroTraspaso) {

        Query query = entityManager
                .createNativeQuery("select * from mtl_transactions_interface mti where mti.SHIPMENT_NUMBER=?1 ");

        try {

            return (List<MtlTransactionsInterface>) query.setParameter(1, numeroTraspaso)
                    .getResultList();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public MtlTransactionsInterface getTransferenciasById(Long transactionInterfaceId) {
        Query query = entityManager.createNativeQuery(
                "select * from mtl_transactions_interface mti where mti.TRANSACTION_INTERFACE_ID=?1 ",
                MtlTransactionsInterface.class);

        try {

            return (MtlTransactionsInterface) query.setParameter(1, transactionInterfaceId)
                    .getSingleResult();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional
    public void delete(Long transactionInterfaceId) {

        iMtlTransactionsInterfaceDao.deleteById(transactionInterfaceId);

    }

}