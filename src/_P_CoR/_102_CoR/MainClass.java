package _P_CoR._102_CoR;
/*Chain of Responsibility --- CoR）模式是行为模式之一，该模式构造一系列分别
 * 担当不同的职责的类的对象来共同完成一个任务，这些类的对象之间像链条一样紧密相连，所以被称作
 * 职责链模式。
 */

/*
 * 职责连模式的应用场景：
 * 例1：比如客户Client要完成一个任务，这个任务包括a,b,c,d四个部分。
 * 首先客户Client把任务交给A，A完成a部分之后，把任务交给B,B完成b部分,...,
 * 知道D完成d部分。
 * 例2：比如政府部分的某项工作，县政府先完成自己能处理的部分，不能处理的部分交给省政府，
 * 省政府再完成自己职责范围内的部分，不能处理的部分交给中央政府,中央政府最后完成该项工作。
 * 例3：软件窗口的消息传播
 * 例4：SERVLET容器的过滤器(Filter)框架实现。
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		//一般的使用方法，创建车需要分别创建车的每一部分。
		CarHandler headH = new CarHeadHandler();
		CarHandler bodyH = new CarBodyHandler();
		CarHandler TailH = new CarTailHandler();
		
		headH.handlerCar();
		bodyH.handlerCar();
		TailH.handlerCar();
		*/
		
		CarHandler headH = new CarHeadHandler();
		CarHandler bodyH = new CarBodyHandler();
		CarHandler tailH = new CarTailHandler();
		
		//组装顺序预先设定好，顺序是车头--车身--车尾
		headH.setNextHandler(bodyH);
		bodyH.setNextHandler(tailH);
		
		//调用职责链的链头完成操作
		headH.handlerCar();
		
		System.out.println("------------------");
		
		//顺序改变，希望 车身--车头--车尾
		bodyH.setNextHandler(headH);
		headH.setNextHandler(tailH);
		bodyH.handlerCar();
	}
}
