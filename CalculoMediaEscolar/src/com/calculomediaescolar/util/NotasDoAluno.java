package com.calculomediaescolar.util;

public class NotasDoAluno {
	
	private float notaPrimeiroSemestre;
	private float notaSegundoSemestre;
	private float notaTerceiroSemestre;
	private float notaQuartoSemestre;
	private float media;
	
	public NotasDoAluno() {}
	
	public NotasDoAluno(float notaPrimeiroSemestre, float notaSegundoSemestre, float notaTerceiroSemestre,
			float notaQuartoSemestre) {
		super();
		this.notaPrimeiroSemestre = notaPrimeiroSemestre;
		this.notaSegundoSemestre = notaSegundoSemestre;
		this.notaTerceiroSemestre = notaTerceiroSemestre;
		this.notaQuartoSemestre = notaQuartoSemestre;
	}

	public NotasDoAluno(float notaPrimeiroSemestre, float notaSegundoSemestre, float notaTerceiroSemestre,
			float notaQuartoSemestre, float media) {
		super();
		this.notaPrimeiroSemestre = notaPrimeiroSemestre;
		this.notaSegundoSemestre = notaSegundoSemestre;
		this.notaTerceiroSemestre = notaTerceiroSemestre;
		this.notaQuartoSemestre = notaQuartoSemestre;
		this.media = media;
	}
	
	public void printNotes() {
		media = (notaPrimeiroSemestre + notaSegundoSemestre + notaTerceiroSemestre + notaQuartoSemestre) / 4;
		System.out.println("VALOR DA PRIMEIRA NOTA: " + this.notaPrimeiroSemestre);
		System.out.println("VALOR DA SEGUNDA NOTA: " + this.notaSegundoSemestre);
		System.out.println("VALOR DA TERCEIRA NOTA: " + this.notaTerceiroSemestre);
		System.out.println("VALOR DA QUARTA NOTA: " + this.notaQuartoSemestre);
		System.out.println("MEDIA: " + media);
	}

	public float getNotaPrimeiroSemestre() {
		return notaPrimeiroSemestre;
	}

	public void setNotaPrimeiroSemestre(float notaPrimeiroSemestre) {
		this.notaPrimeiroSemestre = notaPrimeiroSemestre;
	}

	public float getNotaSegundoSemestre() {
		return notaSegundoSemestre;
	}

	public void setNotaSegundoSemestre(float notaSegundoSemestre) {
		this.notaSegundoSemestre = notaSegundoSemestre;
	}

	public float getNotaTerceiroSemestre() {
		return notaTerceiroSemestre;
	}

	public void setNotaTerceiroSemestre(float notaTerceiroSemestre) {
		this.notaTerceiroSemestre = notaTerceiroSemestre;
	}

	public float getNotaQuartoSemestre() {
		return notaQuartoSemestre;
	}

	public void setNotaQuartoSemestre(float notaQuartoSemestre) {
		this.notaQuartoSemestre = notaQuartoSemestre;
	}
	
	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "NotasDoAluno [notaPrimeiroSemestre=" + notaPrimeiroSemestre + ", notaSegundoSemestre="
				+ notaSegundoSemestre + ", notaTerceiroSemestre=" + notaTerceiroSemestre + ", notaQuartoSemestre="
				+ notaQuartoSemestre + "]";
	}
	
}
