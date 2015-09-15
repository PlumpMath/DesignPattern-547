package _K_Composite._101_Composite;

import java.util.List;

/*
 * 文件节点抽象(文件和目录的父类)
 */
public interface IFile {
	//显示文件或者文件夹的名称
	public void display();
	
	//子节点管理方法
	public boolean add(IFile file);
	public boolean remove(IFile file);
	public List<IFile> getChild();
}
