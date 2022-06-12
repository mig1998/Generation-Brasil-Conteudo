package br.com.generation.listaexercicios;

import java.util.Scanner;

//6. Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

//d=v(x2-x1)² +(y2-y1)²

public class exercicio6 {

	public static void main(String[] args) {
		
		double x1,y1,x2,y2,d;

		Scanner dados=new Scanner(System.in);

		System.out.println("digite o valor de x1:");
		x1=dados.nextDouble();

		System.out.println("digite o valor de y1:");
		y1=dados.nextDouble();
		
		System.out.println("digite o valor de x2:");
		x2=dados.nextDouble();
		
		System.out.println("digite o valor de y2:");
		y2=dados.nextDouble();


		
		d=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		
		System.out.printf("A Distancia é de: %.2f",d);
		

		dados.close();
		
		
	}

}
