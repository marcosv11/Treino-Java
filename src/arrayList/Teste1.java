package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Teste1 {

	public static void main(String[] args) {


		ArrayList<String> cursos = new ArrayList<String>();
		
		String curso1 = "curso de Java";
		String curso2 = "curso de Spring";
		String curso3 = "curso de Angular";

		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		 
		
		System.out.println(cursos);
		
		Collections.sort(cursos);
		
		String cursoNumero1 = cursos.get(1);
		
		System.out.println("O primeiro curso da lista eh o: " + cursoNumero1);
	}

}
