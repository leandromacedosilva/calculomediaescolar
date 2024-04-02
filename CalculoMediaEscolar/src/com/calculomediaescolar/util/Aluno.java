package com.calculomediaescolar.util;

public class Aluno {
	
	private String nome;
	private String cpf;
	
	public Aluno() {}

	public Aluno(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void printAluno() {
		System.out.println("NOME: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + "]";
	}

}
