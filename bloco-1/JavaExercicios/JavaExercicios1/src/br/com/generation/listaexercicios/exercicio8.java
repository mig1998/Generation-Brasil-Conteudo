package br.com.generation.listaexercicios;

import java.util.Scanner;

//8.O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
//consumidor.

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double custoConsumidor,custoFabrica;
		
		Scanner dados=new Scanner(System.in);
		
		
		
		System.out.println("digite o custo de fabrica");
		custoFabrica=dados.nextDouble();
		
		
		custoFabrica+=(custoFabrica*28/100)+(custoFabrica*45/100);
		
		System.out.println("O custo total do carro � de: "+custoFabrica);
		
		dados.close();

	}

}
