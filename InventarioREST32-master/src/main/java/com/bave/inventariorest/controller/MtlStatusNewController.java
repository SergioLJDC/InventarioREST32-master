package com.bave.inventariorest.controller;


import com.bave.inventariorest.dao.MtlStatusNewRepository;
import com.bave.inventariorest.model.MtlStatusNew;
import com.bave.inventariorest.model.XxpdaLogUser;
import com.bave.inventariorest.service.MtlStatusNewServicie;
import com.bave.inventariorest.service.XxpdaLogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller
@RestController
@CrossOrigin
public class MtlStatusNewController {


    @Autowired
    MtlStatusNewServicie mtlStatusNewServicie;

    @PersistenceContext()
    private EntityManager entityManager;

    @PostMapping("/MtlStatusNewServicie/insert")
    @ResponseBody
    public void insert(@RequestBody MtlStatusNew mtlStatusNew){
        mtlStatusNewServicie.insert(mtlStatusNew);
    }
}
