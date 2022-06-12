package ex5;

public class Patinete {

private	String nome,modelo;
private	int dataFabricacao;
	
	
	
	public Patinete(String nome, String modelo, int dataFabricacao) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
	}
	
	
	public void Andar() {
		System.out.println("Andando");
	}
	
	public void Stop() {
		System.out.println("parar");
	}
	
	public String Dados() {
		String dados="Nome:"+getNome()+" Modelo:"+getModelo()+" data de Fabricação:"+getDataFabricacao();
		
		return dados;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public String getModelo() {
		return modelo;
	}
	public int getDataFabricacao() {
		return dataFabricacao;
	}

	
	


}