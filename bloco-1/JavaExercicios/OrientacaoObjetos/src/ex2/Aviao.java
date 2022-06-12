package ex2;

public class Aviao {

private	String marca,modelo,nome,fabricante;
private	int anoFabricacao;
private	double velocidade=0;
	
	
	
	public Aviao(String marca, String modelo, String nome, String fabricante, int anoFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nome = nome;
		this.fabricante = fabricante;
		this.anoFabricacao = anoFabricacao;
	}
	
	public String Dados() {
		String dados="Marca:"+getMarca()+" Modelo:"+getModelo()+" Nome:"+getNome()+" Fabricante:"+getFabricante()+" "
				+ " ano de Fabricação:"+getAnoFabricacao();
		
		return dados;
	}
	
	
	public void Voar(double velocidade) {
		this.velocidade+=velocidade;
	
		
		
		System.out.println("Estou Voando velocidade:"+this.velocidade);
	}
	
	public void Pousar(double velocidade) {
		this.velocidade-=velocidade;
		System.out.println("Estou Pousando...velocidade:"+this.velocidade);
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getNome() {
		return nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}








}