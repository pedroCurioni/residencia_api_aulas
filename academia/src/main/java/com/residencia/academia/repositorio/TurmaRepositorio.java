package com.residencia.academia.repositorio;

import com.residencia.academia.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface TurmaRepositorio extends JpaRepository<Turma, Integer>{
    Turma findByDataInicio(Date dataInicio);

}
