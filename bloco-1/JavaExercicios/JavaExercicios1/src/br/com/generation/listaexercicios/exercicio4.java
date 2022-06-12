package br.com.generation.listaexercicios;

import java.util.Scanner;

//4.Escreva  um sistema que leia três números inteiros 
//e positivos (A, B, C) e calcule a seguinte expressão:  
//d=R+S/2
//R=(A+B)²
//S=(B+C)²

public class exercicio4 {

	public static void main(String[] args) {
		
		double a,b,c,r,s;

		Scanner dados=new Scanner(System.in);

		System.out.println("digite o 1º numero:");
		a=dados.nextDouble();

		System.out.println("digite o 2º numero:");
		b=dados.nextDouble();
		
		System.out.println("digite o 3º numero:");
		c=dados.nextDouble();
		
		
		r=Math.pow((a+b),2);
		s=Math.pow((b+c),2);
		
		System.out.println("Resultado é de:"+(r+s)/2);
		

		dados.close();
		
		
	}

}
