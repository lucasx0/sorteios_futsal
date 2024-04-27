package com.sort_futsal.sorteios_futsal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sort_futsal.sorteios_futsal.model.Cadastro;
import com.sort_futsal.sorteios_futsal.model.ModelResponse;
import com.sort_futsal.sorteios_futsal.repository.cadastroRepository;

@Service
public class serviceCadastro {
    
    @Autowired
    private cadastroRepository vRepository;

    @Autowired
    private ModelResponse mResponse;

    
    //CADASTRO

    public ResponseEntity<?> registrationchange(Cadastro cadastro, String action){
        if(cadastro.getNome().equals("")){
             mResponse.setMensagem("O nome precisa ser preenchido");
            return new ResponseEntity<>(mResponse, HttpStatus.BAD_REQUEST);
        }else if(cadastro.getSenha().equals("")){
            mResponse.setMensagem("A senha precisa ser preenchida");
            return new ResponseEntity<>(mResponse, HttpStatus.BAD_REQUEST);
        }else if(cadastro.getEmail().equals("")){
            mResponse.setMensagem("O e-mail precisa ser preenchido");
            return new ResponseEntity<>(mResponse, HttpStatus.BAD_REQUEST);
        }else{
            if(action.equals("/register")){
                return new ResponseEntity<>(vRepository.save(cadastro), HttpStatus.CREATED);
            }else {
                return new ResponseEntity<>(vRepository.save(cadastro), HttpStatus.OK);
            }
        }

        //deletar

        
    
    }
}
