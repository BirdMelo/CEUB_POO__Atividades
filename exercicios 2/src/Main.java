import University.Department;
import University.Teacher;
import University.University;
import biblioteca.Biblioteca;
import biblioteca.Livro;
import computer.Computer;
import computer.Processor;
import computer.RAMMemory;
import onlineStore.Order;
import onlineStore.OrderItem;
import onlineStore.Product;

public class Main {
	public static String highlight(String str) {
		return "\n======== "+str+" ========\n";
	}
	public static void main(String[] args) {
		
		//ATIVIDADE 1
		System.out.println(highlight("ATIVIDADE 1"));

		Biblioteca b1 = new Biblioteca("Biblioteca de Alexandria");
		Livro frankenstein = new Livro("Frankenstein","Mary Shelly" , "1818");
		//Livro engenharia = new Livro("Engenharia de software","Sommerville" , "1996");
		//Livro redes = new Livro("Redes de Computadores", "Andraw Tanenbaum", "1988");
		
		b1.setLivro(frankenstein);
		System.out.printf(
				"Nome da Biblioteca: %s\nNome livro: %s\nAutor(a): %s\nAno de publicação: %s\n",
				b1.getName(),b1.getLivro().getTitle(), b1.getLivro().getAuthor(), 
				b1.getLivro().getReleaseDate()
				)
		;
		
		//ATIVIDADE 2
		System.out.println(highlight("ATIVIDADE 2"));

		RAMMemory ram = new RAMMemory(16, "DDR5");
		Processor processor = new Processor("Redragon", "3200MHz");
		Computer computer = new Computer(ram,processor);
		computer.showDetails();

		//ATIVIDADE 3
		System.out.println(highlight("ATIVIDADE 3"));

		Teacher teacher = new Teacher("Gustavo", 6719235);
		Department department = new Department(
				"Departamento de Pesquisa de Microbiologia da Univercidade de Brasília", "Biologia"
		);
		department.setTeacher(teacher);
		University university = new University("Univercidade de Brasília", department);

		System.out.printf(
				"""
				Nome da univercidade: %s
				Departamento: %s
				Diciplina: %s
				Professor responsável: %s
				TRN do professor: %d
				""",
				university.getName(), department.getName(), department.getDiscipline(),
				teacher.getName(), teacher.getTRN()
		);

		//ATIVIDADE 4
		System.out.println(highlight("ATIVIDADE 4"));

		Product product = new Product("caneta azul", 2.50);
		OrderItem orderItem = new OrderItem(product, 200);
		Order order = new Order(1, orderItem);

		System.out.printf("custo total: R$%.2f\n",order.getOrderItem().getSubtotal());

	}
}
