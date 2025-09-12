package aula5;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> disciplinas = new ArrayList<String>();
		//CREATE ELEMENTS
		disciplinas.add("POO");
		disciplinas.add("Banco de Dados II");
		disciplinas.add("Desenvolvimento de Interfaces");
		disciplinas.add("Engenharia de Requisitos");
		disciplinas.add("Ética");
		
		System.out.println(disciplinas);
		System.out.println(disciplinas.get(2));
		disciplinas.set(1, "Banco de Dados I");
		System.out.println(disciplinas);
	
		disciplinas.remove(4);
		System.out.println(disciplinas);
		
		for(int i = 0; i < disciplinas.size(); i++) {
			System.out.printf("%d° disciplina\n", i+1);
			System.out.println(disciplinas.get(i));
		}
		for (String string : disciplinas) {
			System.err.println(string);
		}
		System.out.println(disciplinas.contains("POO"));
		System.out.println(disciplinas.contains("Ética"));
	}
}
