package repeticoes;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class ex2 {

	public static void main(String[] args) {
		
		int num,par=0,impar=0;
	

		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("digite o "+i+"� numero:");
			num=sc.nextInt();
			
				if(num%2==0) {
					par++;
				}else {
					impar++;
				}
				
		}
		
		System.out.println("numeros pares: "+par);
		System.out.println("numeros impares: "+impar);
		sc.close();
		
	}

}
