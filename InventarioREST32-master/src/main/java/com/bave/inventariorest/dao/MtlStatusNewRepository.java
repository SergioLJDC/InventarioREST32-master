package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlStatusNew;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlStatusNewRepository extends CrudRepository<MtlStatusNew, String> {

     MtlStatusNew save(MtlStatusNew mtlStatusNew);


}