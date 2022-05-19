package com.residencia.firstapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "autor_id")
	private Integer autorId;

	@Column(name = "autor_nome")
	private String autorNome;

	@OneToMany(mappedBy = "autor")
	@JsonIgnore
	private List<Livro> livroList;

	public Integer getAutorId() {
		return autorId;
	}

	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}

	public String getAutorNome() {
		return autorNome;
	}

	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}

	public List<Livro> getLivroList() {
		return livroList;
	}

	public void setLivroList(List<Livro> livroList) {
		this.livroList = livroList;
	}
}
