package com.residencia.firstapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.firstapi.entity.Autor;
import com.residencia.firstapi.entity.Editora;

public interface EditoraRepository extends JpaRepository<Editora, Integer> {
	
}