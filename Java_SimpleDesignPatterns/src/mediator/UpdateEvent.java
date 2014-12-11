package mediator;

public class UpdateEvent {

	public static final int UPDATE = 0;
	public static final int SHOW = 1;
	public static final int HIDE = 2;
	public static final int LOAD = 3;
	private int eventType = -1;
	
	public UpdateEvent (int eventType) {
		this.eventType = eventType;
	}
	
	public int getEventType () {
		return eventType;
	}
}
