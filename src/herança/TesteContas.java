package herança;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1533, 1533);
		cc.deposita(100);

		ContaPoupanca cp = new ContaPoupanca(1445, 1882);
		cp.deposita(200);

		cp.transfere(10, cc);

		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
	}

}
