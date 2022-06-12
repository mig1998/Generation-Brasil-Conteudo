package br.com.generation.listaexercicios;

import java.util.Scanner;

//3.Faça um sistema que leia o tempo de duração de um evento em uma 
//fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.  

public class exercicio3 {

	public static void main(String[] args) {
		
		int segundosTotal,horas,minutos,segundos;

		Scanner dados=new Scanner(System.in);

		System.out.println("digite o total de segundos:");
		segundosTotal=dados.nextInt();
				
		horas=segundosTotal/3600;	
		segundosTotal%=3600;
		minutos=segundosTotal/60;
		segundos=segundosTotal%60;
		
		System.out.printf("%d hora\n%d minutos\n%d segundos ",horas,minutos,segundos);

		
		dados.close();
		
		
	}

}
