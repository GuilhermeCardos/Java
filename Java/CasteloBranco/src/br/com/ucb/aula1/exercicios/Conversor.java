package br.com.ucb.aula1.exercicios;
public class Conversor {
	public static void main(String[] args) {
		
		/*
		 	@Autor: LUIZ GUILHERME CARDOSO / MATRICULA: 201818040
		 	@Conversor de Km para milhas. Em algumas fontes 1 milha equivale 1.609 em outra equivale 0.62137.
		 	@Fontes: Google e  Metric Conversions
		 */
		
		float km, milha, valor=90;
		
		milha = (valor / 1.609f);
		System.out.println("90km corresponde a "+milha+" milhas");
		
		km = (valor * 1.609f);
		System.out.print("90 milhas corresponde a "+km+" km");
		
	}

}
