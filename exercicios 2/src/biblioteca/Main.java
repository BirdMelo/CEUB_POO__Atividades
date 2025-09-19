package biblioteca;

public class Main {
	public static void main(String[] args) {
		
		//ATIVIDADE 1
		
		Biblioteca b1 = new Biblioteca("Biblioteca de Alexandria");
		Livro frankenstein = new Livro("Frankenstein","Mary Shelly" , "1818");
		//Livro engenharia = new Livro("Engenharia de software","Sommerville" , "1996");
		//Livro redes = new Livro("Redes de Computadores", "Andraw Tanenbaum", "1988");
		
		b1.setLivro(frankenstein);
		System.out.printf(
				"Nome da Biblioteca: %s\nNome livro: %s\nAutor(a): %s\nAno de publicação: %s",
				b1.getName(),b1.getLivro().getTitle(), b1.getLivro().getAuthor(), 
				b1.getLivro().getReleaseDate()
				)
		;
		
		//ATIVIDADE 2
		
	}
}
