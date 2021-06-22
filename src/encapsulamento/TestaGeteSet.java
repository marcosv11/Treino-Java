package encapsulamento;

public class TestaGeteSet {

	public static void main(String[] args) {

		Conta conta = new Conta(1554, 13245);
		conta.setAgencia(1099);
		conta.setNumero(707620);
		Cliente marcos = new Cliente();
		marcos.setNome("Marcos Vinicius");
		conta.setTitular(marcos);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setNome("Bruce willians");
		
		Conta conta2 = new Conta(222, 13333245);
		Conta conta3 = new Conta(222, 13333245);
		
		System.out.println(Conta.getTotal());
		
		
		
		
	}
}
