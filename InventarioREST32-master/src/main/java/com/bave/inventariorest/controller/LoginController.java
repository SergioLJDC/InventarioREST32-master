package com.bave.inventariorest.controller;

import com.bave.inventariorest.dao.IXxpdaLoginRepository;
import com.bave.inventariorest.model.TransactionsDto;
import com.bave.inventariorest.model.XxpdaLogin;
import com.bave.inventariorest.service.DtoService;
import com.bave.inventariorest.service.LocalizadorService;
import com.bave.inventariorest.service.XxpdaLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.PreparedStatement;
import java.util.List;

@Controller
@RestController
@CrossOrigin
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    IXxpdaLoginRepository iXxpdaLoginRepository;

    @Autowired
    XxpdaLoginService xxpdaLoginService;



    @GetMapping("/All")
    public @ResponseBody List<XxpdaLogin> getAllUsers() {
        return iXxpdaLoginRepository.findAll();
    }

    @GetMapping("/{usuario}")
    public @ResponseBody List<XxpdaLogin> Login(String usuario){
        return iXxpdaLoginRepository.findByUsuario(usuario);
    }

    @GetMapping("/Search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(xxpdaLoginService.findByUsuario(filtro));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/filtro/{usuario}")
    public List<XxpdaLogin> findByUsuario1(@PathVariable String usuario){
        return iXxpdaLoginRepository.findByUsuario1(usuario);
    }

    @GetMapping("/filtro/{usuario}/{pass}")
    public Boolean Confirmacion(@PathVariable String usuario, @PathVariable String pass){
        return xxpdaLoginService.Confirmacion(usuario,pass);
    }





}
