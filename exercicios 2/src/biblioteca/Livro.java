package biblioteca;

public class Livro {
	private String title;
	private String author;
	private String releaseDate;
	
	public Livro(String title, String author, String release) {
		this.title = title;
		this.author = author;
		this.releaseDate = release;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
