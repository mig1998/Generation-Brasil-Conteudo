package ex2;

import java.util.Scanner;

public class ex2 {

	
//	
//	Crie uma classe avi�o e apresente os atributos e m�todos referentes
//	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
//	objeto e apresente as informa��es deste objeto no console.
	
	
	public static void main(String[] args) {
		
		String marca,modelo,nome,fabricante;
		int anoFabricacao;
		char respost;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite a Marca do Avi�o:");
		marca=sc.nextLine();		
		System.out.println("Digite o Modelo do Avi�o:");
		modelo=sc.nextLine();
		System.out.println("Digite a Nome do Avi�o:");
		nome=sc.nextLine();
		System.out.println("Digite o Fabricante do Avi�o:");
		fabricante=sc.nextLine();
		System.out.println("Digite o ano de fabrica��o do Avi�o:");
		anoFabricacao=sc.nextInt();
	
		

		
		Aviao aviao=new Aviao(marca, modelo, nome, fabricante, anoFabricacao);
		
				
		System.out.println(aviao.Dados());
		
		aviao.Voar(150);
		
		System.out.println("deseja pousar? S ou N");
		respost=sc.next().charAt(0);
		sc.close();
		
		switch(respost) {
		case 'S','s':
			aviao.Pousar(150);
		break;
		
		case 'N','n':
		System.out.println("Seguindo voo...");
		break;
		
		default:
		System.out.println("Ent�o, seu avi�o bateu");
		break;
		
		}

		
	}

}
