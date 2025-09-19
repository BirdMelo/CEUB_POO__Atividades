package aula7;

public class Aluno {
	private String nome;
	private String RA;
	private Endereco endereco;
	
	//Polimorfismo Sobrecarga
	public Aluno(String n, Endereco e) {
		this.nome = n;
		this.endereco = e;
	}
	public Aluno () {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
