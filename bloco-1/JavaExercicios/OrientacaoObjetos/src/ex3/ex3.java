package ex3;

import java.util.Scanner;

public class ex3 {

//	
//	Crie uma classe produto eletrônico e apresente os atributos e métodos
//	referentes esta classe, em seguida crie um objeto produto eletrônico,
//	defina as instancias deste objeto e apresente as informações deste objeto
//	no console.
//	
	
	public static void main(String[] args) {
		
		String nome,descricao,fabricante;
		int id;
		double precoCusto,precoVenda;


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o Nome do Produto:");
		nome=sc.nextLine();			
		System.out.println("Digite a descrição do Produto:");
		descricao=sc.nextLine();		
		System.out.println("Digite o Fabricante do Produto:");
		fabricante=sc.nextLine();		
		System.out.println("Digite o id do Produto:");
		id=sc.nextInt();		
		System.out.println("Digite o Preço custo do Produto:");
		precoCusto=sc.nextDouble();		
		System.out.println("Digite o Preço Venda do Produto:");
		precoVenda=sc.nextDouble();		
		
		
		sc.close();
		
		ProdutoEletronico eletronicos=new ProdutoEletronico(nome, descricao, fabricante, id, precoCusto, precoVenda);
		
				
		System.out.println(eletronicos.Dados());
		
		
		eletronicos.Ligar();
		eletronicos.Desligar();
	}

}
