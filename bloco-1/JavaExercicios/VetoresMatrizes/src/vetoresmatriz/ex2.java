package vetoresmatriz;

import java.util.Random;


//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//quantas foram as ocorr�ncias da maior pontua��o.

public class ex2 {	
	
	public static void main(String[] args) {
		int[] valores=new int[10];

		int maiorPont=0;
		double media=0;
		
		
		Random sorte=new Random();
		
		
		for(int i=0;i<10;i++) {
			
			valores[i]=sorte.nextInt(6)+1;
			
			System.out.println("Resultado dado "+(i+1)+"�: "+valores[i]);
						
			media+=valores[i];
			
			if(valores[i]>maiorPont) {
			maiorPont++;
			}
			
			
		}
		

	
		System.out.printf("\nMedia dos numeros %.2f\n ",media/=10);
	
		System.out.println("Quantas vezes a maior pontua��o foi obtida "+maiorPont+"x");
	}

}
