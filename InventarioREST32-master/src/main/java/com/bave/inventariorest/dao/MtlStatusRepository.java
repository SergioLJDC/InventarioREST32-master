package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlStatusRepository extends CrudRepository<MtlStatus, String> {


    MtlStatus save(MtlStatus MtlStatus);
}