package trabalho01;

public class ContaCorrente extends conta{
	double limiteChequeEspecal;
	
	@Override
	public double calcularSaldoFinal() {
		double saldo = getSaldo();
		return setSaldo(saldo - 15);
	}
}
