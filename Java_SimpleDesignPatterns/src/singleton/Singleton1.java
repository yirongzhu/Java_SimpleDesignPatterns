package singleton;

// If you have to extend other classes by using singleton, this enum is not applicable, because enum doesn't allow
// extends any classes but it allows to implement interfaces.
public enum Singleton1 {

	INSTANCE;
	
	public void showMessage(String message) {
		System.out.println(message);
	}
}
