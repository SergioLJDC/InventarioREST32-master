package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.XxpdaLogUser;
import com.bave.inventariorest.service.XxpdaLogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller
public class xxpdaLogUserController {

    @Autowired
    XxpdaLogUserService xxpdaLogUserService;

    @PersistenceContext()
    private EntityManager entityManager;

    @PostMapping("/userLog/insert")
    @ResponseBody
    public void insert(@RequestBody XxpdaLogUser xxpdaLogUser){
        xxpdaLogUserService.insert(xxpdaLogUser);
    }

}
