package exerciciosCondicionais;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.

public class ex2 {

	public static void main(String[] args) {
		
		int n1,n2,n3,grande=0,medio=0,pequeno=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("digite o 1° numero: ");
		n1=sc.nextInt();

		System.out.println("digite o 2° numero: ");
		n2=sc.nextInt();
		
		System.out.println("digite o 3° numero: ");
		n3=sc.nextInt();
		
		
		
		if((n1>n2 && n1>n3) && (n2>n3 && n2<n1)) {
			grande=n1;
			medio=n2;
			pequeno=n3;
			
		}else {
			grande=n1;
			medio=n3;
			pequeno=n2;
			
		}

		
		
		
		if((n2>n1 && n2>n3) && (n1>n3 && n1<n2)) {
			grande=n2;
			medio=n1;
			pequeno=n3;	
		}else {
			grande=n2;
			medio=n3;
			pequeno=n1;
		}
		
		
		
		
		if((n3>n2 && n3>n1) && (n1>n2 && n1<n3)) {
			grande=n3;
			medio=n1;
			pequeno=n2;	
		}else {
			grande=n3;
			medio=n2;
			pequeno=n1;
		}
		
		
			if(grande>medio && medio>pequeno) {
			System.out.printf("%d, %d, %d",pequeno,medio,grande);
			}else if(medio>grande && medio>pequeno) {
				System.out.printf("%d, %d, %d",grande,pequeno,medio);
			}
			
		sc.close();
	}

}
