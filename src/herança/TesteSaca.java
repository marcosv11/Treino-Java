package herança;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca(1533, 123);
		conta.deposita(230);
		
		
		System.out.println(conta.getSaldo());
	}
}
