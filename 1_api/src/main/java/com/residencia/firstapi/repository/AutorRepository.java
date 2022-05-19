package com.residencia.firstapi.repository;

import java.util.List;

import com.residencia.firstapi.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
	Autor findByAutorNome(String nome);


}