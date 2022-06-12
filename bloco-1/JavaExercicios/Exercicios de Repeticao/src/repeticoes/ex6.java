package repeticoes;

import java.util.Scanner;

//Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)

public class ex6 {

	public static void main(String[] args) {

		int digitado=0,num,num3=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		do {
			
			System.out.println("digite um numero inteiro: (digite 0 para sair)");
			num=sc.nextInt();
			
			if(num%3==0) {
			num3+=num;
			digitado++;
			}
			
		}while(num!=0);
		
		
		System.out.println("A média dos números múltiplos de 3"+num3/digitado);
		
		sc.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
