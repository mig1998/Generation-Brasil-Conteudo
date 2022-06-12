package ex01_ex02;

public class Preguica extends Animal implements acoes {
	
	
	
	public void SubirArvore(String nome) {
		System.out.println(nome+" Esta Subindo uma Arvore");
	}
	
	

	@Override
	public void fazerSom() {
		System.out.println("barulho");	
	}
	
}
