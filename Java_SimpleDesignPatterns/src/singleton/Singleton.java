package singleton;

// Singleton pattern is one of the creational design patterns. It helps in creating only one single object of a class. 
// Multiple objects cannot be created. When you initiate the Singleton Class, you cannot use new. You can only use 
// a method to get the instance of this class for you. The constructor of Singleton is private and the initialization
// is synchronized. 
// Singleton is used when your class need to use a lot of resources or takes a lot of memories. Also, it could be used
// when you need to handle all your requests in a single class.
public final class Singleton {

	private static Singleton singleton;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized(Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public void printMessage(String message) {
		System.out.println(message);
	}
}
