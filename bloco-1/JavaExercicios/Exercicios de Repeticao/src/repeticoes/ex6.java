package repeticoes;

import java.util.Scanner;

//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
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
		
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3"+num3/digitado);
		
		sc.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
