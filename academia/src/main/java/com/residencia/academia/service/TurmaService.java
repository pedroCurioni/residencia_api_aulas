package com.residencia.academia.service;

import com.residencia.academia.entity.Turma;
import com.residencia.academia.repositorio.TurmaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {
    @Autowired
    TurmaRepositorio turmaRepositorio;

    public List<Turma> findAll() {
        return turmaRepositorio.findAll();
    }

    public Turma findById(Integer id) {
        return turmaRepositorio.findById(id).get();
    }

    public Turma save(Turma turma) {
        return turmaRepositorio.save(turma);
    }

    public Turma update(Turma turma, Integer id) {
        return turmaRepositorio.save(turma);
    }

    public void delete(Integer id) {
        turmaRepositorio.deleteById(id);
    }

}
