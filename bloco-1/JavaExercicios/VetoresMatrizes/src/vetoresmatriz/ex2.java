package vetoresmatriz;

import java.util.Random;


//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.

public class ex2 {	
	
	public static void main(String[] args) {
		int[] valores=new int[10];

		int maiorPont=0;
		double media=0;
		
		
		Random sorte=new Random();
		
		
		for(int i=0;i<10;i++) {
			
			valores[i]=sorte.nextInt(6)+1;
			
			System.out.println("Resultado dado "+(i+1)+"º: "+valores[i]);
						
			media+=valores[i];
			
			if(valores[i]>maiorPont) {
			maiorPont++;
			}
			
			
		}
		

	
		System.out.printf("\nMedia dos numeros %.2f\n ",media/=10);
	
		System.out.println("Quantas vezes a maior pontuação foi obtida "+maiorPont+"x");
	}

}
