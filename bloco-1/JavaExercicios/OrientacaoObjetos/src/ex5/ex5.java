package ex5;

import java.util.Scanner;

public class ex5 {

//	
//	5) Crie uma classe patinete e apresente os atributos e métodos referentes
//	esta classe, em seguida crie um objeto patinete, defina as instancias deste
//	objeto e apresente as informações deste objeto no console.
//	
	
	public static void main(String[] args) {
		
		String nome,modelo;
		int dataFabricacao;


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o Nome do Patinete:");
		nome=sc.nextLine();			
		System.out.println("Digite o Modelo do Patinete:");
		modelo=sc.nextLine();		
		System.out.println("Digite a Data de Fabricação do Patinete:");
		dataFabricacao=sc.nextInt();		
		
		
		sc.close();
		
		Patinete patinete=new Patinete(nome, modelo, dataFabricacao);
		
				
		System.out.println(patinete.Dados());
		
		
		
		patinete.Andar();
		patinete.Stop();
	}

}
