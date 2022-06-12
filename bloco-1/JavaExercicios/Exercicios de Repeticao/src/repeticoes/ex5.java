package repeticoes;

import java.util.Scanner;

//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

public class ex5 {

	public static void main(String[] args) {

		double soma=0;
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		
		do {
			
			System.out.println("digite um numero: (digite 0 para sair)");
			num=sc.nextInt();
			
			soma+=num;
			
			
		}while(num!=0);
		
		
		System.out.println("a soma de todos numeros digitados é de: "+soma);
		
		sc.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
