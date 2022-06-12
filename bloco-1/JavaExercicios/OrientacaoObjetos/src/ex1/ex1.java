package ex1;

import java.util.Scanner;

public class ex1 {

	
	
//	
//	Crie uma classe cliente e apresente os atributos e métodos referentes
//	esta classe, em seguida crie um objeto cliente, defina as instancias deste
//	objeto e apresente as informações deste objeto no console.
	
	
	public static void main(String[] args) {
		
		String nome,end,item;
		int idade,cpf;


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o Nome:");
		nome=sc.nextLine();
		
		System.out.println("Digite o endereço:");
		end=sc.nextLine();
		
		System.out.println("Digite a idade:");
		idade=sc.nextInt();
		
		System.out.println("Digite o CPF:");
		cpf=sc.nextInt();
		

		
		System.out.println("Digite o item que quer comprar:");
		item=sc.next();
		
		
		

		sc.close();
		
		Cliente cliente=new Cliente(nome, end, idade, cpf);
		
		System.out.println(cliente.Dados());
		cliente.Comprar(item);
	}

}
