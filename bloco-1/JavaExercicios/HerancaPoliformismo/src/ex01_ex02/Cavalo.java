package ex01_ex02;

public class Cavalo extends Animal implements acoes{

	
	
	public void Correr(String nome) {
		System.out.println(nome+" Esta Correndo");
		
		
		
	}

	@Override
	public void fazerSom() {
		System.out.println("relinchar");
	}
	
}
