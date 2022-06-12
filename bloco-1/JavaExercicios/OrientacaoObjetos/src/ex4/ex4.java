package ex4;

import java.util.Scanner;

public class ex4 {

//	
//	4) Crie uma classe funcionário e apresente os atributos e métodos
//	referentes esta classe, em seguida crie um objeto funcionário, defina as
//	instancias deste objeto e apresente as informações deste objeto no
//	console.
//	
	
	public static void main(String[] args) {
		
		String nome,rua;
		int id,idade,cpf;
		double salario;


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o Nome do Funcionario:");
		nome=sc.nextLine();			
		System.out.println("Digite a rua do Funcionario:");
		rua=sc.nextLine();		
		System.out.println("Digite o ID do Funcionario:");
		id=sc.nextInt();		
		System.out.println("Digite a idade Funcionario:");
		idade=sc.nextInt();		
		System.out.println("Digite o CPF do Funcionario:");
		cpf=sc.nextInt();		
		System.out.println("Digite o salario do Funcionario:");
		salario=sc.nextDouble();		
		
		
		sc.close();
		
		Funcionario funcionarios=new Funcionario(nome, rua, id, idade, cpf, salario);
		
				
		System.out.println(funcionarios.Dados());
		
		funcionarios.Trabalhar();
		
	}

}
