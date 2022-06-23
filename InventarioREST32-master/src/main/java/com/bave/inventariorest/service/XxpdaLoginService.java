package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IXxpdaLoginRepository;
import com.bave.inventariorest.model.Localizador;
import com.bave.inventariorest.model.XxpdaLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class XxpdaLoginService   {

    @Autowired
    private IXxpdaLoginRepository iXxpdaLoginRepository;


    public List<XxpdaLogin> findByUsuario(String filtro) throws Exception{
        try {
            List<XxpdaLogin> login = iXxpdaLoginRepository.findByUsuario(filtro);
            return login;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional(readOnly = true)
    public List<XxpdaLogin> findByUsuario1(String subinventarioCodigo){
        return iXxpdaLoginRepository.findByUsuario1(subinventarioCodigo);
    }

    @Transactional(readOnly = true)
    public Boolean Confirmacion(String filtro , String filtro2){
        List<XxpdaLogin> Usuario = iXxpdaLoginRepository.Confirmacion(filtro, filtro2);
        if(Usuario.size()> 0) {
            if (Usuario.get(0).getUsuario().toString().equals(filtro)) {

                if (Usuario.get(0).getPass().toString().equals(filtro2.toString())) {
                    return true;

                } else {
                    return false;
                }
            }
        }
        return false;
    }

}
