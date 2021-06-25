package array;


import herança.ContaCorrente;


public class TesteGuardador {

	public static void main(String[] args) {
	 
		  
		GuardadorDeContas guardador = new GuardadorDeContas();

        herança.Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        herança.Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

       }

	}


