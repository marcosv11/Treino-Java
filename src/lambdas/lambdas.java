package lambdas;

import java.util.ArrayList;

import herança.Conta;
import herança.ContaCorrente;

public class lambdas {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		for (Object o : lista) {
			System.out.println(o);
		}

		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

	}
}
