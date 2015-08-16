package _K_Composite._101_Composite;

/*
 * ʲô�����ģʽ
 * Compositeģʽ�ǹ������͵����ģʽ֮һ��ͨ���ݹ��ֶ����������εĶ���ṹ��
 * ������ͨ��һ����������������������
 */
public class MainClass {
	public static void main(String[] args) {
		//C��
		Folder rootFolder = new Folder("C:");
		//ibeifengĿ¼
		Folder beifengFolder = new Folder("beifeng");
		//beifeng.txt�ļ�
		File beifengFile = new File("beifeng.txt");
		
		rootFolder.add(beifengFile);
		rootFolder.add(beifengFolder);
		
		
		//ibeifengmĿ¼
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
