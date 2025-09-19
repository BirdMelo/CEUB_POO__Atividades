package aula7;

public class Main {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Zé Maria");
		aluno.setRA("2981275132");
		
		Endereco e1 = new Endereco();
		e1.setCep("9861259");
		e1.setLogradouro("Quadra 103");
		e1.setNumero(5);
		
		aluno.setEndereco(e1);
		
		System.out.printf("Nome: %s\nRA:%s\nEndereço: %s",
				aluno.getNome(), aluno.getRA(), aluno.getEndereco().getCep()
				)
		;
		
		Endereco e2 = new Endereco();
		e2.setCep("012740912");
		e2.setLogradouro("SHIS QI 28");
		e2.setNumero(23);
		
		Aluno a2 = new Aluno("Carlos", e2);
		a2.setRA("5901270983");
		
		System.out.printf("Nome: %s\nRA:%s\nEndereço: %s",
				a2.getNome(), a2.getRA(), a2.getEndereco().getCep()
				)
		;
	}
}
