package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class teste {

	public static void main(String[] args) {


		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		
		System.out.println(aulas);
		
		aulas.remove(aula1);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula" + aula);
		});
		
		aulas.add("Aumentando noss conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);

	}

}
