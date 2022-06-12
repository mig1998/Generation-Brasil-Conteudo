package ex1;

public class Cliente {

	private String nome,rua;
	private int idade,cpf;
	
	public Cliente(String nome, String rua, int idade, int cpf) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public void Comprar(String item) {
		System.out.println(getNome()+" comprou o item "+item);
	}
	
	public String Dados() {
		String dados="Nome:"+getNome()+" Rua:"+getRua()+" Idade:"+getIdade()+" CPF:"+getCpf();
		
		return dados;
	}

	public String getNome() {
		return nome;
	}


	public String getRua() {
		return rua;
	}


	public int getIdade() {
		return idade;
	}


	public int getCpf() {
		return cpf;
	}
	
	
}
