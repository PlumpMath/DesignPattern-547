package _L_Bridge._103_Bridge;

/*
 * Æû³µ
 */
public abstract class Car {
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(Engine engine){
		this.engine = engine;
	}
	
	public abstract void installEngine();
}
