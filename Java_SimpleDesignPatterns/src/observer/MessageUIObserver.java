package observer;

public class MessageUIObserver implements Observer{

	public void update(Observerable o, Object data) {
		System.out.println("message to show: " + data);
	}
}
