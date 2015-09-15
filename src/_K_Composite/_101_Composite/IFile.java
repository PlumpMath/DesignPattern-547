package _K_Composite._101_Composite;

import java.util.List;

/*
 * �ļ��ڵ����(�ļ���Ŀ¼�ĸ���)
 */
public interface IFile {
	//��ʾ�ļ������ļ��е�����
	public void display();
	
	//�ӽڵ������
	public boolean add(IFile file);
	public boolean remove(IFile file);
	public List<IFile> getChild();
}
