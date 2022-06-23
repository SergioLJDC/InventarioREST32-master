package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.Organizacion;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IOrganizacionDao extends PagingAndSortingRepository<Organizacion,Long> {


}
