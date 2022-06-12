package br.com.generation.listaexercicios;

import java.util.Scanner;

//1. Faça um sistema que leia a idade de uma pessoa expressa em anos,meses e dias 
//e mostre-a expressa apenas em dias. 

public class exercicio1 {

	public static void main(String[] args) {
		
		int ano,mes,dias,totalDias,totalAno,totalMes;

		Scanner dados=new Scanner(System.in);

		System.out.println("digite os anos:");
		ano=dados.nextInt();

		System.out.println("digite os meses:");
		mes=dados.nextInt();
		
		System.out.println("digite os dias:");
		dias=dados.nextInt();
		
		
		totalAno=ano*365;
		totalMes=mes*30;
		totalDias=totalAno+totalMes+dias;
		
		System.out.println("Idade Total em dias: "+totalDias);
		
		
		
		dados.close();
	}

}
