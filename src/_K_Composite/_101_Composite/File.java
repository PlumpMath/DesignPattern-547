package _K_Composite._101_Composite;

import java.util.List;
/*
 * File类，不会包含子节点，相当于树叶
 */
public class File implements IFile {
	
	private String name;
	public File(String name){
		this.name = name;
	}
	
	@Override
	public void display() {
		System.out.println("文件名：" + this.name);
	}
	
	/*
	 * 将对象管理的方法定义在IFile接口中也可以定义在子类中
	 */
	@Override
	public List<IFile> getChild() {
		return null;
	}

	@Override
	public boolean add(IFile file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(IFile file) {
		// TODO Auto-generated method stub
		return false;
	}

}
