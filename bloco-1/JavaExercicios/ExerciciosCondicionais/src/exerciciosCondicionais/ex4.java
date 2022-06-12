package exerciciosCondicionais;

import java.util.Scanner;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

public class ex4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("digite o numero: ");
		num=sc.nextInt();		

		if(num%2==0) {
			
			System.out.println("o numero "+num+" É par");
			System.out.printf("raiz quadrada de %d é: %.2f",num,Math.sqrt(num));
			
		}else {
			
			System.out.println("o numero "+num+" É impar");
			System.out.printf(num+" ao quadrado é: %.2f",Math.pow(num,2));
			
			
		}

	}

}
