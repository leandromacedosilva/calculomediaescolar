package com.calculomediaescolar.util;

public class Aluno {
	
	private String nome;
	private String cpf;
	private int anoNascimento;
	
	public Aluno() {}

	public Aluno(String nome, String cpf, int anoNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
	}
	
	public void printAluno() {
		System.out.println("NOME: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("ANO DE NASCIMENTO: " + this.anoNascimento);
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
	
	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", anoNascimento=" + anoNascimento + "]";
	}

}
