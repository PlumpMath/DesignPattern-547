package _D_Builder._104_Builder;
/*
 * Director��ɫ��builder����ͨ�����ַ�ʽ����
 * 1��ͨ�����캯������
 * 2��ͨ��makeHouse�������루��ã�
 * 4��ͨ��set��������
 */
public class HouseDirector {
	private HouseBuilder builder;

	public HouseDirector(HouseBuilder builder) {
		this.builder = builder;
	}

	public void makeHouse(){
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
	}
}
