package _R_TemplateMethod._104_TemplateMethod;

public abstract class MakeCar {
	//��װ��ͷ
	public abstract void makeHead();
	
	//����
	public abstract void makeBody();
	
	//��β
	public abstract void makeTail();
	
	public void make(){
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}
}
