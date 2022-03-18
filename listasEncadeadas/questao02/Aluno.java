package br.ucsal.listasEncadeadas.questao02;

public class Aluno {

	private Integer matricula;
	private String nome;
	private String email;
	
	public Aluno(Integer matricula, String nome, String email) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return matricula;
	}

	public void setId(Integer id) {
		this.matricula = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
