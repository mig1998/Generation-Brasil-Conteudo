package vetoresmatriz;

import java.util.Scanner;

//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

public class ex1 {

	
	
	
	public static void main(String[] args) {
		int[] valores=new int[5];

		int maiorPont=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("digite 5 numeros e descubra qual o maior:");
		
		
		for(int i=0;i<valores.length;i++) {
			
			System.out.println("Valor "+(i+1)+" :");
			valores[i]=sc.nextInt();
			
			System.out.println("valor digitado: "+valores[i]);
			
			if(valores[i]>maiorPont) {
				maiorPont=valores[i];
			}
			
			
		}
		
		
		System.out.println("\nMaior numero digitado: "+maiorPont);
		sc.close();
	
	}

}
