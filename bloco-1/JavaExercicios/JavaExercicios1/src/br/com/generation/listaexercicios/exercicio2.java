package br.com.generation.listaexercicios;

import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias 
//e mostre-a expressa em anos, meses e dias.  

public class exercicio2 {

	public static void main(String[] args) {
		
		int ano,mes,dias,totalDias;

		Scanner dados=new Scanner(System.in);

		System.out.println("digite o total de dias:");
		totalDias=dados.nextInt();
		
		
		ano=totalDias/365;
		mes=totalDias%365/30;
		dias=totalDias%365;	
		
		totalDias%=30;
		
		
		System.out.println("Idade Total em ano: "+ano);
		System.out.println("Idade Total em meses: "+mes);
		System.out.println("Idade Total em : "+totalDias);
		
		
		dados.close();
		
	}

}
