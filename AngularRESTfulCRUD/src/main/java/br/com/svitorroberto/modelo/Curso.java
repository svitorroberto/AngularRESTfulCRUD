package br.com.svitorroberto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="periodo")
	private String periodo;
	
	@Column(name="situacao")
	private char situacao;
	

	
	public Curso(Long id, String nome,String periodo,char situacao){
		this.id = id;
		this.nome = nome;
		this.periodo = periodo;
		this.situacao = situacao;
	}
	
	public Curso(Long id){
		this.id = id;
	}

	public Curso(){
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	public char getSituacao() {
		return situacao;
	}


	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}
	
	
	
	
}
