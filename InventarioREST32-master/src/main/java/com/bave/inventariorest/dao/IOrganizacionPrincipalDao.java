package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.OrganizacionPrincipal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface IOrganizacionPrincipalDao extends PagingAndSortingRepository<OrganizacionPrincipal,Long> {




    @Query("SELECT o FROM OrganizacionPrincipal o where o.idOrganizacion=?1")
    OrganizacionPrincipal getId(Long id);




}
