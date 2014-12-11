package observer;

public class ObserverClientTest {

	public static void main(String[] args) {
		MessageDataIO m = new MessageDataIO();
		Observer o1 = new MessageUIObserver();
		Observer o2 = new MessageSaveObserver();
		Observer o3 = new MessageLogObserver();
		m.addObserver(o1);
		m.addObserver(o2);
		m.addObserver(o3);
		m.setMessage("This is a test");
	}
	
	
}
