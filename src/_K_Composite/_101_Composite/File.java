package _K_Composite._101_Composite;

import java.util.List;
/*
 * File�࣬��������ӽڵ㣬�൱����Ҷ
 */
public class File implements IFile {
	
	private String name;
	public File(String name){
		this.name = name;
	}
	
	@Override
	public void display() {
		System.out.println("�ļ�����" + this.name);
	}
	
	/*
	 * ���������ķ���������IFile�ӿ���Ҳ���Զ�����������
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
