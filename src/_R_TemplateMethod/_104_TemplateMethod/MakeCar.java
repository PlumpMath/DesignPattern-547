package _R_TemplateMethod._104_TemplateMethod;

public abstract class MakeCar {
	//组装车头
	public abstract void makeHead();
	
	//车身
	public abstract void makeBody();
	
	//车尾
	public abstract void makeTail();
	
	public void make(){
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}
}
