package aula03;

public class Main {
	
	public static void main(String[] args) {
		Revista r1 = new Revista();
		r1.setTitulo("Quatro Rodas");
		
		Revista r2 = new Revista();
		r2.setTitulo("Turma da Mônica");
		
		System.out.println(r1.getTitulo());
		System.out.println(r2.getTitulo());
		
	}
	
}
