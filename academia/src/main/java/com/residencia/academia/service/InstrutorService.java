package com.residencia.academia.service;

import com.residencia.academia.entity.Instrutor;
import com.residencia.academia.repositorio.InstrutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrutorService {
    @Autowired
    InstrutorRepositorio instrutorRepositorio;

    public List<Instrutor> findAll() {
        return instrutorRepositorio.findAll();
    }

    public Instrutor findById(Integer id) {
        return instrutorRepositorio.findById(id).get();
    }

    public Instrutor save(Instrutor instrutor) {
        return instrutorRepositorio.save(instrutor);
    }

    public Instrutor update(Instrutor instrutor, Integer id) {
        return instrutorRepositorio.save(instrutor);
    }

    public void delete(Integer id) {
        instrutorRepositorio.deleteById(id);
    }

    public void delete(Instrutor instrutor){
        instrutorRepositorio.delete(instrutor);
    }
}
