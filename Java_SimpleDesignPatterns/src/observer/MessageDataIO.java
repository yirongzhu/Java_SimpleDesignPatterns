package observer;

public class MessageDataIO extends Observerable{

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
		setChanged();
		notifyObservers(message);
	}
	
	public String getMessage() {
		return message;
	}
}
