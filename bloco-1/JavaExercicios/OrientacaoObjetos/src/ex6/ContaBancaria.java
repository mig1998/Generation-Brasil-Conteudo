package ex6;

public class ContaBancaria {

	private String nome;
	private int idade,senha,cpf;
	private double saldo;

	
	public ContaBancaria(String nome, int idade, int senha, int cpf, double saldo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.senha = senha;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public String Dados() {
		String dados="Nome:"+getNome()+" Idade:"+getIdade()+" Senha:"+getSenha()+" CPF:"+getCpf()+" Saldo: "+getSaldo();
		
		return dados;
	}
	
  public void Depositar(double saldo) {
	  deposito(saldo);
  }
  
  public void Saque(double saldo) {
	  saque(saldo);
  }
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public int getSenha() {
		return senha;
	}
	public int getCpf() {
		return cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double saldo) {
		this.saldo+=saldo;
	}
	public void saque(double saldo) {
		this.saldo-=saldo;
	}
	

}