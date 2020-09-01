package fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Unity{
	
	private List<Unity> contents;
	
	public Folder(String name, int size) {
		super(name, size);
		this.contents = new ArrayList<Unity>();
	}
	
	public void add(Unity content) {
		this.setSize(this.getSize() + content.getSize());
		this.contents.add(content);
	}
	
	public void remove(Unity content) {
		this.contents.remove(content);
	}

	@Override
	public void echo() {
		System.out.println(this.getName() + ": " + this.getSize() + " kb.");
		for (Unity content : this.contents) {
			System.out.print(this.getName() + "/");
			content.echo();
		}
	}
	
}
