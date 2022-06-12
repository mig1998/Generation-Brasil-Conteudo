package ex2;

import java.util.Scanner;

public class ex2 {

	
//	
//	Crie uma classe avião e apresente os atributos e métodos referentes
//	esta classe, em seguida crie um objeto avião, defina as instancias deste
//	objeto e apresente as informações deste objeto no console.
	
	
	public static void main(String[] args) {
		
		String marca,modelo,nome,fabricante;
		int anoFabricacao;
		char respost;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite a Marca do Avião:");
		marca=sc.nextLine();		
		System.out.println("Digite o Modelo do Avião:");
		modelo=sc.nextLine();
		System.out.println("Digite a Nome do Avião:");
		nome=sc.nextLine();
		System.out.println("Digite o Fabricante do Avião:");
		fabricante=sc.nextLine();
		System.out.println("Digite o ano de fabricação do Avião:");
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
		System.out.println("Então, seu avião bateu");
		break;
		
		}

		
	}

}
