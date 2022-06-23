package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlMaterialTransactionsDto;
import com.bave.inventariorest.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@CrossOrigin
@RestController
public class ITransactionController {
    @Autowired
    ITransactionService iTransactionService;

    @GetMapping("/Transaction/getAll")
    List<MtlMaterialTransactionsDto> GetAll(){
        return iTransactionService.getAll();
    }

}
