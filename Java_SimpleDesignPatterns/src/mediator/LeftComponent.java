package mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LeftComponent extends JPanel implements ActionListener, ComponentView {

	private JButton button2;
	private Mediator mediator;
	
	public LeftComponent (Mediator mediator) {
		this.mediator = mediator;
		mediator.register(this);
		createUI();
	}
	
	private void createUI() {
		button2 = new JButton();
		button2.addActionListener(this);
		add(button2);
	}
	
	public void updateView(UpdateEvent e) {
		if (e.getEventType() == UpdateEvent.UPDATE) {
			System.out.println("Update the data!");
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button2) {
			mediator.fireUpdate(new UpdateEvent(UpdateEvent.LOAD));
		}
	}

	
}
