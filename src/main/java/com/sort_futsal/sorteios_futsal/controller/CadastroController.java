package com.sort_futsal.sorteios_futsal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sort_futsal.sorteios_futsal.model.Cadastro;
import com.sort_futsal.sorteios_futsal.service.serviceCadastro;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private serviceCadastro ServiceCadastro;

      @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Cadastro cadastro){
        return ServiceCadastro.registrationchange(cadastro, "register");
    }
}
