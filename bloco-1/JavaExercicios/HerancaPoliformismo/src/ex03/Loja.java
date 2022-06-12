package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	
	
//	
//	Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
//	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
//	programa deverá atender as seguintes funcionalidades:
//	Armazenar dados da List
//	Remover dados da list;
//	Atualizar dados da list.
//	Apresentar todos os dados da list.
//	
	public static void main(String[] args) {
		
		String nome,desc;
		double preco;
		int op,id;
		char resp=' ';
		
		ArrayList<String> produtos=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		Produtos produto=new Produtos();

		do {
			
		System.out.println("1-Cadastrar Produto \n 2-Remover Produto \n 3-Editar Produto \n 4-Mostrar Produtos");
		op=sc.nextInt();

	
			switch(op) {
				case 1:
				System.out.println("Nome Produto: ");
				nome=sc.next();
				produto.setNome(nome);
				
				System.out.println("Descrição Produto: ");
				desc=sc.next();
				produto.setDesc(desc);
				
				System.out.println("Preço do Produto: ");
				preco=sc.nextDouble();
				produto.setPreco(preco);
				
				produtos.add(produto.toString());
				produto.increment();
				System.out.println("Produto Cadastrado com Sucesso!");
				break;
				
				case 2:
				System.out.println("Deseja Remover Qual Produto? informe o id:");
				id=sc.nextInt();
				
				if(id<produtos.size()) {	
				produtos.remove(id);
				System.out.println("Produto Removido com Sucesso!");
				}else {
					System.out.println("Esse Produto não existe!");
				}
	
				
				break;
				
				case 3:
				System.out.println("id Produto que deseja Editar: ");
				id=sc.nextInt();
				
				if(id<produtos.size()) {
				System.out.println("Nome Produto: ");
				nome=sc.next();
				produto.setNome(nome);
				
				System.out.println("Descrição Produto: ");
				desc=sc.next();
				produto.setDesc(desc);
				
				System.out.println("Preço do Produto: ");
				preco=sc.nextDouble();
				produto.setPreco(preco);
				
				produtos.set(id,produto.toString());
				}else {
					System.out.println("este Produto não existe!!");
				}
				break;

				case 4:
				System.out.println("Produtos: ");
				for(int i=0;i<produtos.size();i++) {
				System.out.println(produtos.get(i).toString());	
					
				}
				
				break;
				
				default:
					System.out.println("Esta opção não existe!");
				break;
			
			}
			System.out.println("deseja sair do programa? s ou n");
			resp=sc.next().charAt(0);
		
			
		}while(resp!='s');
		
		System.out.println("fim!");
		sc.close();
		
		
		
	}

}
