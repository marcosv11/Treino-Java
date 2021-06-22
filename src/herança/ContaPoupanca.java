package herança;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) {
		double valorASacar = valor + 33;
		 super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
