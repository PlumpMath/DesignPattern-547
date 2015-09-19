package _J_Facade._104_Facade;

public class JiJin_Facade {
	GuoZhai guozhai;
	GuPiao gupiao;
	WaiHui waihui;
	QiHuo qihuo;
	
	public JiJin_Facade(){
		guozhai = new GuoZhai();
		gupiao = new GuPiao();
		waihui = new WaiHui();
		qihuo = new QiHuo();
	}
	public void buy(){
		gupiao.buy();
		qihuo.chao();
		guozhai.buy();
		waihui.buy();
	}
}
