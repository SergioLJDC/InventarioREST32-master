package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.TransactionsDto;
import com.bave.inventariorest.service.DtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DtoTransactionController {

    @Autowired
    DtoService dtoService;

    @GetMapping("/transaction/getAll")
    public List<TransactionsDto> getall(){
        return dtoService.getAll();
    }

}
