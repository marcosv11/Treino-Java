package array;

import herança.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(1131, 33233);
		ContaCorrente cc2 = new ContaCorrente(1311, 33233);
		ContaCorrente cc3 = new ContaCorrente(1114, 34533);
		ContaCorrente cc4 = new ContaCorrente(1511, 33343);
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
		contas[3] = cc4;
		
		System.out.println(contas[1].getAgencia());
		
		ContaCorrente ref = contas[1];
		System.out.println(cc1.getAgencia());
		System.out.println(ref.getAgencia());
		

	}

}
