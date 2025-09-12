package aula03;

public class Revista {
	private String autor;
	private String titulo;
	private String editora;
	
	public String getTitulo() {
		return this.titulo.toUpperCase();
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return this.editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
