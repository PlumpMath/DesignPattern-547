package _K_Composite._101_Composite;

/*
 * 什么是组合模式
 * Composite模式是构造类型的设计模式之一，通过递归手段来构造树形的对象结构，
 * 并可以通过一个对象来访问整个对象树
 */
public class MainClass {
	public static void main(String[] args) {
		//C盘
		Folder rootFolder = new Folder("C:");
		//ibeifeng目录
		Folder beifengFolder = new Folder("beifeng");
		//beifeng.txt文件
		File beifengFile = new File("beifeng.txt");
		
		rootFolder.add(beifengFile);
		rootFolder.add(beifengFolder);
		
		
		//ibeifengm目录
		Folder ibeifengFolder = new Folder("ibeifeng");
		File ibeifengFile = new File("iBeifeng.txt");
		rootFolder.add(ibeifengFolder);
		rootFolder.add(ibeifengFile);
		
		displayTree(rootFolder);
	}
	
	public static void displayTree(IFile rootFolder){
		rootFolder.display();
		for(IFile file:rootFolder.getChild()){
			if (file instanceof File) {
				file.display();
			}else{
				displayTree(file);
			}
		}
	}
}
