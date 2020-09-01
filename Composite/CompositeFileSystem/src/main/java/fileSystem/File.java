package fileSystem;

public class File extends Unity{

	public File(String name, int size) {
		super(name, size);
	}

	@Override
	public void echo() {
		System.out.println(this.getName() + ": " + this.getSize() + " kb.");
	}

}
