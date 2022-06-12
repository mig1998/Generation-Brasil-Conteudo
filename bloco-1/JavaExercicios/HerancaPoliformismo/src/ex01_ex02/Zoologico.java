package ex01_ex02;

import java.util.Scanner;

public class Zoologico {

	
//1	Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
//	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
//	características de forma que tudo o que for comum a todos os animais fique na classe
//	Animal

//2	Implemente um programa que crie os 3 tipos de animais definidos no exercício
//	anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
//	é, independente do tipo de animal.

	
	
	public static void main(String[] args) {
		
		String nome;
		int idade,resp;
		
		
		Scanner sc=new Scanner(System.in);

		Animal comer=new Animal();
		Cachorro cachorro=new Cachorro();
		Cavalo cavalo=new Cavalo();
		Preguica preguica=new Preguica();
		
		
		
		System.out.println("Qual animal voce deseja registrar? 1-Cachorro 2-Cavalo 3-Preguiça");
		resp=sc.nextInt();
		
		
		
		switch(resp) {
		
			case 1:
			System.out.println("O nome do cachorro:");
			nome=sc.next();
			System.out.println("A idade do cachorro:");
			idade=sc.nextInt();
			
			
			cachorro.setNome(nome);
			cachorro.setIdade(idade);
			
			cachorro.Correr(nome);
			comer.Comer(cachorro);
			break;
			
			case 2:	
			System.out.println("O nome do Cavalo:");
			nome=sc.next();
			System.out.println("A idade do Cavalo:");
			idade=sc.nextInt();
			
			cavalo.setNome(nome);
			cavalo.setIdade(idade);
			
			cavalo.Correr(nome);
			comer.Comer(cavalo);
			break;
			
			case 3:	
				System.out.println("O nome da Preguiça:");
				nome=sc.next();
				System.out.println("A idade da Preguiça:");
				idade=sc.nextInt();
					
				preguica.setNome(nome);
				preguica.setIdade(idade);
				
				preguica.SubirArvore(nome);
				comer.Comer(preguica);
			break;

			default:
			System.out.println("não temos esse animal aqui!");
			break;
		
		}
		
		
		sc.close();
	}

}
