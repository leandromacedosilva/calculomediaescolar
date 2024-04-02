package com.calculomediaescolar.view;

import java.util.Scanner;

import com.calculomediaescolar.util.Aluno;
import com.calculomediaescolar.util.NotasDoAluno;

public class MainAlunoInf {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("**************************************");
		System.out.println("INFORME OS DADOS DO ALUNO");
		System.out.println("**************************************");
		System.out.print("NOME DO ALUNO: ");
		String nome = input.nextLine();
		System.out.print("CPF: ");
		String cpf = input.nextLine();
		System.out.print("INFORME A PRIMEIRA NOTA DO ALUNO: ");
		float notaPrimeiroSemestre = input.nextFloat();
		System.out.print("INFORME A SEGUNDA NOTA DO ALUNO: ");
		float notaSegundoSemestre = input.nextFloat();
		System.out.print("INFORME A TERCEIRA NOTA DO ALUNO: ");
		float notaTerceiroSemestre = input.nextFloat();
		System.out.print("INFORME A QUARTA NOTA DO ALUNO: ");
		float notaQuartaSemestre = input.nextFloat();
		
		System.out.println();
		System.out.println("=======================================");
		System.out.println("INFORMACOES DO ALUNO");
		System.out.println("=======================================");
		
		Aluno aluno = new Aluno(nome, cpf);
		NotasDoAluno notasDoAluno = new NotasDoAluno(notaPrimeiroSemestre,notaSegundoSemestre,notaTerceiroSemestre,notaQuartaSemestre);
		
		aluno.printAluno();
		notasDoAluno.printNotes();
		
		input.close();
	}

}
