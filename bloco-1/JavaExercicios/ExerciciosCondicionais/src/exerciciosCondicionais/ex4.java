package exerciciosCondicionais;

import java.util.Scanner;

//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
//Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

public class ex4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("digite o numero: ");
		num=sc.nextInt();		

		if(num%2==0) {
			
			System.out.println("o numero "+num+" � par");
			System.out.printf("raiz quadrada de %d �: %.2f",num,Math.sqrt(num));
			
		}else {
			
			System.out.println("o numero "+num+" � impar");
			System.out.printf(num+" ao quadrado �: %.2f",Math.pow(num,2));
			
			
		}

	}

}
