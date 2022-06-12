package ex3;

public class ProdutoEletronico {

private String nome,descricao,fabricante;
private int id;
private	double precoCusto,PrecoVenda;
	
	
	
	public ProdutoEletronico(String nome, String descricao, String fabricante, int id, double precoCusto,
			double precoVenda) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.id = id;
		this.precoCusto = precoCusto;
		PrecoVenda = precoVenda;
	}
	
	public String Dados() {
		String dados="Nome:"+getNome()+" Descrição:"+getDescricao()+" Fabricante:"+getFabricante()+" Preço Custo"+getPrecoCusto()+""
				+ " Preço Venda:"+getPrecoVenda();
		
		return dados;
	}
	
	public void Ligar() {
		System.out.println("Ligado!");
	}
	
	public void Desligar() {
		System.out.println("Desligado!");
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrecoCusto() {
		return precoCusto;
	}
	
	public double getPrecoVenda() {
		return PrecoVenda;
	}

	
	
	
}
	
