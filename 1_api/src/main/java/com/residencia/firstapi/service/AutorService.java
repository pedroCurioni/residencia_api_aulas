package com.residencia.firstapi.service;

import java.util.List;

import com.residencia.firstapi.entity.Editora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.firstapi.entity.Autor;
import com.residencia.firstapi.repository.AutorRepository;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> findAll(){
        return autorRepository.findAll();
    }

    public Autor findById(Integer id){
        return autorRepository.findById(id).get();
    }

    public Autor findByAutorNome(String nome) {
    	return autorRepository.findByAutorNome(nome);
    }

    public Autor save(Autor autor){
        return autorRepository.save(autor);
    }

    public Autor update(Autor autor, Integer id){
        Autor autualizado = findById(id);
        autualizado.setAutorNome(autor.getAutorNome());
        return autorRepository.save(autualizado);
    }

    public void delete(Integer id){
        Autor autor = autorRepository.findById(id).get();
        autorRepository.delete(autor);
    }
}
