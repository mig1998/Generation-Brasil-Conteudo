package vetoresmatriz;

import java.util.Random;


//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//posição das matrizes N1 e N2.

public class ex3 {	
public static void main(String[] args) throws InterruptedException {
				
	double[][] n1 = new double[4][6];
	double[][] n2 = new double[4][6];
	double[][] m1 = new double[4][6];
	double[][] m2 = new double[4][6];
	
		Random random=new Random();
		
		for(int i=0;i<n1.length; i++) {
			
			for(int j=0;j<n1[i].length; j++) {
				n1[i][j] = random.nextDouble()*100;
				n2[i][j] = random.nextDouble()*100;
				
				m1[i][j]=n1[i][j]+n2[i][j];
				m2[i][j]=n1[i][j]-n2[i][j];	
			}
			
		}
		
		
		
//		----------------------imprimindo na tela--------------------------------------------------

		System.out.println("n1:");
		for(int i=0;i<n1.length; i++) {
			
			for(int j=0;j<n1[i].length; j++) {
				System.out.printf("{%.2f}",n1[i][j]);
				Thread.sleep(200);
			}
			System.out.println(" ");

		}


		System.out.println("n2:");
		for(int i=0;i<n1.length; i++) {
			
			for(int j=0;j<n1[i].length; j++) {
				System.out.printf("{%.2f}",n2[i][j]);
				Thread.sleep(200);
			}
			System.out.println(" ");

		}

		
		
		System.out.println("resultado m1:");
		for(int i=0;i<n1.length; i++) {
			
			for(int j=0;j<n1[i].length; j++) {
				System.out.printf("{%.2f}",m1[i][j]);
				Thread.sleep(200);
			}
			System.out.println(" ");

		}


		System.out.println("resultado m2:");
		for(int i=0;i<n1.length; i++) {
			
			for(int j=0;j<n1[i].length; j++) {
				System.out.printf("{%.2f}",m2[i][j]);
				Thread.sleep(200);
			}
			System.out.println(" ");

		}

		
	}
}
