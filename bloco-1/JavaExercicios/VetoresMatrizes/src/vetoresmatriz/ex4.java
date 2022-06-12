package vetoresmatriz;

import java.util.Scanner;

//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.

public class ex4 {	
public static void main(String[] args) throws InterruptedException {
				
	double[][] matrix= new double[3][3];
	double soma=0,somadiagonal=0;
	
	
	
		Scanner sc= new Scanner(System.in);
		
		
		
		for(int i=0;i<matrix.length; i++) {
		
			System.out.println("digite 3 valores: ");
			
			for(int j=0;j<matrix[i].length; j++) {
				matrix[i][j]=sc.nextDouble();				
			
				soma+=matrix[i][j];
			
				if(matrix[i]==matrix[j]) {
					somadiagonal+=matrix[i][j];
				}
			
			}
		
		}
		

		for(int i=0;i<matrix.length; i++) {
			for(int j=0;j<matrix[i].length; j++) {
				System.out.printf("{%.2f}",matrix[i][j]);
				Thread.sleep(200);				
			}
			System.out.println(" ");
		}
		
		System.out.printf("soma de todos valores: %.2f ",soma);
		System.out.printf("diagonal: %.2f ",somadiagonal);
		sc.close();
		
	}	
}

