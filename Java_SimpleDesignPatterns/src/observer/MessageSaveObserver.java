package observer;

public class MessageSaveObserver implements Observer {
	
	public void update(Observerable o, Object data) {
		System.out.println("message to save " + data);
	}
}
