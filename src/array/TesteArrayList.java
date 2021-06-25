package array;

import java.util.ArrayList;

import herança.Conta;
import herança.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(222, 333);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(422, 633);
		lista.add(cc2);

		System.out.println(lista.size());
		
		Conta ref =(Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		
		
		System.out.println(lista.size());
		
		for(Object o : lista) {
			System.out.println(o);
		}
	}

}
