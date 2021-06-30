package arrayList;

public class TestaCursoComAluno {
		
	public static void main(String[] args) {
		
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34342);
		Aluno a2 = new Aluno("Marcos Vinicius", 23242);
		Aluno a3 = new Aluno("Nata Grecu", 23233);
		Aluno a4 = new Aluno("Rodrigo Turini", 12331);
		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		
		System.out.println("Todos os alunos matriculados");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		
		System.out.println("O aluno " + a1 + "está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		System.out.println(a1.equals(a2));
	}
	
}
