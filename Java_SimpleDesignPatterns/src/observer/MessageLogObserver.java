package observer;

public class MessageLogObserver implements Observer {

	public void update(Observerable o, Object data) {
		System.out.println("message to log " + data);
	}
}
