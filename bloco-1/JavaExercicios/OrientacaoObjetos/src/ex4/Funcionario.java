package ex4;

public class Funcionario {

	private String nome,rua;
	private int id,idade,cpf;
	private	double salario;
	
	
	
	public Funcionario(String nome, String rua, int id, int idade, int cpf, double salario) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.id = id;
		this.idade = idade;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public String Dados() {
		String dados="ID:"+getId()+" Nome:"+getNome()+" Rua:"+getRua()+" Idade:"+getIdade()+" CPF:"+getCpf()+" Salario:"+getSalario();
		
		return dados;
	}
	
	
	public void Trabalhar() {
		System.out.println("Estou Trabalhando");
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
	public double getSalario() {
		return salario;
	}




}