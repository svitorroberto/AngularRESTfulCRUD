package br.com.svitorroberto.modelo;

public class Curso {
	
	private Long id;
	private String nome;
	private String periodo;
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
