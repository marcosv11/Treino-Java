package array;


import heran�a.ContaCorrente;


public class TesteGuardador {

	public static void main(String[] args) {
	 
		  
		GuardadorDeContas guardador = new GuardadorDeContas();

        heran�a.Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        heran�a.Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

       }

	}


