package ex6;

import java.util.Scanner;

public class ex6 {

//	
//	6) Crie uma classe conta bancaria e apresente os atributos e métodos
//	referentes esta classe, em seguida crie um objeto conta bancaria, defina
//	as instancias deste objeto e apresente as informações deste objeto no
//	console.
	
	
//	
	
	public static void main(String[] args) {
		
		String nome;
		int idade,senha,cpf,resp;
		double saldo,money=0;


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o Nome :");
		nome=sc.nextLine();			
		System.out.println("Digite a Idade:");
		idade=sc.nextInt();			
		System.out.println("Digite a Senha:");
		senha=sc.nextInt();			
		System.out.println("Digite o CPF:");
		cpf=sc.nextInt();			
		System.out.println("Deposite o saldo Inicial:");
		saldo=sc.nextDouble();
		
	
		
		
		
		
		
		ContaBancaria conta=new ContaBancaria(nome, idade, senha, cpf, saldo);
		
				
		System.out.println(conta.Dados());
			
		System.out.println("deseja 1-Depositar ou 2-retirar?");
		resp=sc.nextInt();
		
		switch(resp) {
		case 1:
		System.out.println("quanto deseja Depositar?");
		money=sc.nextDouble();
		conta.Depositar(money);
		System.out.println("saldo: "+conta.getSaldo());
		System.out.println("Obrigado!  tchau");
		break;
		
		case 2:
		System.out.println("quanto deseja Retirar?");
		money=sc.nextDouble();
		conta.Saque(money);
		System.out.println("saldo: "+conta.getSaldo());
		System.out.println("Obrigado!  tchau");
		break;
		
		
		
		}
		
		
		sc.close();
	}

}
