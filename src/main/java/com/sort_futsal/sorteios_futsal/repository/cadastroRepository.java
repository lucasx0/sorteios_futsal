package com.sort_futsal.sorteios_futsal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sort_futsal.sorteios_futsal.model.Cadastro;

@Repository
public interface cadastroRepository extends CrudRepository<Cadastro, Integer>{

    int countById(int id);

    Cadastro findById(int id);
    
}
