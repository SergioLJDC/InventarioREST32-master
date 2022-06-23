package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.XxpdaLogUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XxpdaLogUserInfo extends CrudRepository<XxpdaLogUser,Long> {

    XxpdaLogUser save(XxpdaLogUser xxpdaLogUser);

}
