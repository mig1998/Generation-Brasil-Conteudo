package ex7;

public class Paciente {

	private String nome,rua;
	private int id,idade,cpf;
	

	
	public Paciente(String nome, String rua, int id, int idade, int cpf) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.id = id;
		this.idade = idade;
		this.cpf = cpf;
	}

	public void tomarRemedio() {
		System.out.println("Remedio Tomado");
	}

	public String Dados() {
		String dados="ID:"+getId()+" Nome:"+getNome()+" Rua:"+getRua()+" Idade:"+getIdade()+" CPF:"+getCpf();
		
		return dados;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getRua() {
		return rua;
	}
	public int getId() {
		return id;
	}
	public int getIdade() {
		return idade;
	}
	public int getCpf() {
		return cpf;
	}
}
