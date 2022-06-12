package ex7;

import java.util.Scanner;



public class ex7 {

//	
//	Crie uma classe paciente e apresente os atributos e métodos referentes
//	esta classe, em seguida crie um objeto paciente, defina as instancias deste
//	objeto e apresente as informações deste objeto no console.
	
	
//	
	
	public static void main(String[] args) {
		
		String nome,rua;
		int id,idade,cpf;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Digite o Nome do Paciente:");
		nome=sc.nextLine();			
		System.out.println("Digite a rua do Paciente:");
		rua=sc.nextLine();		
		System.out.println("Digite o ID do Paciente:");
		id=sc.nextInt();		
		System.out.println("Digite a idade do Paciente:");
		idade=sc.nextInt();		
		System.out.println("Digite o CPF do Paciente:");
		cpf=sc.nextInt();		
		
		sc.close();
		
		Paciente paciente=new Paciente(nome, rua, id, idade, cpf);
		
				
		System.out.println(paciente.Dados());
		
		paciente.tomarRemedio();
		
	}

}
