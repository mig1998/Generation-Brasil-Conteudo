package br.com.generation.listaexercicios;

import java.util.Scanner;

//4.Escreva  um sistema que leia tr�s n�meros inteiros 
//e positivos (A, B, C) e calcule a seguinte express�o:  
//d=R+S/2
//R=(A+B)�
//S=(B+C)�

public class exercicio4 {

	public static void main(String[] args) {
		
		double a,b,c,r,s;

		Scanner dados=new Scanner(System.in);

		System.out.println("digite o 1� numero:");
		a=dados.nextDouble();

		System.out.println("digite o 2� numero:");
		b=dados.nextDouble();
		
		System.out.println("digite o 3� numero:");
		c=dados.nextDouble();
		
		
		r=Math.pow((a+b),2);
		s=Math.pow((b+c),2);
		
		System.out.println("Resultado � de:"+(r+s)/2);
		

		dados.close();
		
		
	}

}
