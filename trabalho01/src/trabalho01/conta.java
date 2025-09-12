package trabalho01;

public abstract class conta {
	private String numero;
	private String titulo;
	private double saldo;
	private String agencia;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double depositar(double valor) {
		return this.saldo + valor;
	}
	public double sacar(double valor) {
		return this.saldo - valor;
	}
	public double calcularSaldoFinal() {
		return this.saldo;
	}
}
