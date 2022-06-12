package ex03;

public class Produtos {
private String nome,Desc;
private double preco;
private int id=0;




@Override
public String toString() {
	return "Id:"+getId()+" Nome:" + getNome() + ", Descrição:" + getDesc() + ", Preço:" + getPreco();
}


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDesc() {
	return Desc;
}

public void setDesc(String desc) {
	Desc = desc;
}

public double getPreco() {
	return preco;
}

public int getId() {
	return id;
}
public void increment() {
	id++;
}

public void setPreco(double preco) {
	this.preco = preco;
}








}
