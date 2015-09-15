package _D_Builder._104_Builder;
/*
 * BuilderģʽҲ�н�����ģʽ����������ģʽ������GoF�����23�����ģʽ�е�һ�֡�
 * Builderģʽ��һ�ֶ��󴴽�ģʽ֮һ���������ظ��϶���Ĵ������̣����ѷ��϶����
 * �������̼��Գ���ͨ������̳к����صķ�ʽ����̬�ش������и������ԵĶ���
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		//�ͻ���Ҫ�½�һ��house
		//��ͨģʽ---�ͻ�ֱ�ӽ��췿��
		House house = new House();
		house.setFloor("�ذ�");
		house.setWall("ǽ");
		house.setHousetop("�ݶ�");
		
		//������޸����house���Ǿ���Ҫ���ϱߴ������޸ġ�
		//���ҷ��ӵĴ�����ȫ��¶���ͻ�
		*/
		
		/*
		//�ɹ��̶����޷���
		HouseBuilder builder = new PingFangBuilder();
		//��Ȼ��Ҫ���ù��̶ӵķ�������ʱ���ǿ�����������һ����ɫ��Director������ɽ��죬
		//�ý�ɫ��Ҫ����һ��Builder�����ã�ʹ�ø�Builder����ɽ���Ĺ�����
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
		House house = builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
		*/
		
		/*
		HouseBuilder builder = new PingFangBuilder();
		//�������������
		HouseDirector director = new HouseDirector(builder);
		director.makeHouse();
		House house = builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
		*/
		
		
		//�����Ҫ�����������͵ķ���
		HouseBuilder builder = new GongYuBuilder();//���ﻹ����ͨ�����䣬��̬��ѡ�񡰹��̶ӡ�
		HouseDirector director = new HouseDirector(builder);
		director.makeHouse();
		House house = builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
		
	}

}
