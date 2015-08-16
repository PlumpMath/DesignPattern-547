package _K_Composite._101_Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{
	
	private String name;
	private List<IFile>children;
	
	public Folder(String name){
		this.name = name;
		children = new ArrayList<>();
	}
	
	@Override
	public void display() {
		System.out.println("ÎÄ¼þ¼ÐÃû³Æ:" + this.name);
	}


	@Override
	public List<IFile> getChild() {
		return children;
	}

	@Override
	public boolean add(IFile file) {
		return children.add(file);
	}

	@Override
	public boolean remove(IFile file) {
		return children.remove(file);
	}

}
