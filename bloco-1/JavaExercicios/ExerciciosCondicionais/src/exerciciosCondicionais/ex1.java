package exerciciosCondicionais;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class ex1 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("digite o 1� numero: ");
		n1=sc.nextInt();

		System.out.println("digite o 2� numero: ");
		n2=sc.nextInt();
		
		System.out.println("digite o 3� numero: ");
		n3=sc.nextInt();
		
		
		
		if(n1>n2 && n1>n3) {
			System.out.println("este � maior:"+n1);
		}
		if(n2>n1 && n2>n3) {
			System.out.println("este � maior:"+n2);
		}
		if(n3>n1 && n3>n2) {
			System.out.println("este � maior:"+n3);
		}
		

	}

}
