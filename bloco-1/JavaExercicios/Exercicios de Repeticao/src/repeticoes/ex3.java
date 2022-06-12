package repeticoes;

import java.util.Scanner;

////Solicitar a idade de várias pessoas e imprimir:
//Total de pessoas com menos de 21 anos.
//Total de pessoas com mais de 50 anos. 
//O programa termina quando idade for =-99. (WHILE)
public class ex3 {

	public static void main(String[] args) {
		
		int idade=0,idade21=0,idade50=0;
	

		Scanner sc=new Scanner(System.in);
		
		while(idade!=-99) {	
			System.out.println("digite a idade: , PARA SAIR DIGITE -99");
			idade=sc.nextInt();
			
				if(idade<21) {
					idade21++;
				}else if(idade > 50){
					idade50++;
				}
				
		}
		
		System.out.println("numeros pessoas com menos de 21 anos: "+idade21);
		System.out.println("numeros pessoas com mais de 50 anos: "+idade50);
		sc.close();
		
	}

}
