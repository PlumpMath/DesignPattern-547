package _J_Facade._103_Facade;
/*
 * ���ģʽ(Facade)������GoF�����23�����ģʽ�е�һ�֣�FacadeģʽΪһ��������ƹ��ܵ���Ⱥ��
 * ������⣬��ϵͳ�ȵȣ��ṩһ��һ�µļ򵥵Ľ��档���һ�µļ򵥵Ľ��汻����facade
 */
public class MaicClass {
	public static void main(String[] args) {
		/*
		 * �������
		 */
		/*
		//ʵ��A��ϵͳ����
		SystemA systemA = new SystemA();
		systemA.doSomething();
		
		SystemB systemB = new SystemB();
		systemB.doSomething();
		
		SystemC systemC = new SystemC();
		systemC.doSomething();
		
		//����еڶ����ͻ��ˣ���Ҫ��ͬ����ϵͳ
		*/
		
		Facade facade = new Facade();
		facade.doABC();
	}
}
