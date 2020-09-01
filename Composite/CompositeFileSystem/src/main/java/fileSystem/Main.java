package fileSystem;

public class Main {
	public static void main(String[] args) {
		Folder root = new Folder("root", 0);
		root.add(new File("teste.txt", 249));
		root.add(new File("teste2.txt", 563));
		Folder second = new Folder("second", 0);
		root.add(second);
		second.add(new File("teste3.3gp", 4921));
		second.add(new File("teste4.mp4", 21394124));
		second.echo();
		System.out.println("\n");
		root.echo();
	}
}
