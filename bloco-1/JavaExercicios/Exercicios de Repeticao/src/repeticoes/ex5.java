package repeticoes;

import java.util.Scanner;

//Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
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
		
		
		System.out.println("a soma de todos numeros digitados � de: "+soma);
		
		sc.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
