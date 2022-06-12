package br.com.generation.listaexercicios;

import java.util.Scanner;

//5. Faça um sistema que leia as 3 notas de um aluno e calcule amédia final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

public class exercicio5 {

	public static void main(String[] args) {
		
		double nota1,nota2,nota3,media;

		Scanner dados=new Scanner(System.in);

		System.out.println("digite a 1º nota :");
		nota1=dados.nextDouble();

		System.out.println("digite a 2º nota :");
		nota2=dados.nextDouble();
		
		System.out.println("digite a 3º nota :");
		nota3=dados.nextDouble();
		
		
		media=(nota1*2+nota2*3+nota3*5)/(2+3+5);
		
		System.out.println("A media Ponderada é de:"+media);
		

		dados.close();
		
		
	}

}
