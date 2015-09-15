package _D_Builder._105_Builder;
/*
 * Director��ɫ��builder����ͨ�����ַ�ʽ����
 * 1��ͨ�����캯������
 * 2��ͨ��makeHouse�������루��ã�
 * 4��ͨ��set��������
 */
public class HouseDirector {

	public void makeHouse(HouseBuilder builder){
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
	}
}
