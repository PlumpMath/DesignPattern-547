package _G_Observer._103_Observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�������仯");
	}

}
