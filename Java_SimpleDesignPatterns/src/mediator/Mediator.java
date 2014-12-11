package mediator;

import java.util.*;

public class Mediator {

	private List<ComponentView> componentViews = new ArrayList<> ();
	
	public void register(ComponentView view) {
		componentViews.add(view);
	}
	
	public void fireUpdate(UpdateEvent e) {
		for (ComponentView view : componentViews) {
			view.updateView(e);
		}
	}
}
