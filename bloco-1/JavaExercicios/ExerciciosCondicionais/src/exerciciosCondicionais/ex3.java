package exerciciosCondicionais;

import java.util.Scanner;

//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto

public class ex3 {

	public static void main(String[] args) {
		
		int idade;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("digite a idade: ");
		idade=sc.nextInt();		
		
		
		if(idade>=10 && idade<=14) {
			System.out.println("idade: "+idade+" categoria 10-14 Infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("idade: "+idade+" categoria 15-17 Juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("idade: "+idade+" categoria 18-25 Adulto");
		}

	}

}
