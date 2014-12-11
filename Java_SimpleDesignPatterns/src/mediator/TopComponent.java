package mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TopComponent extends JPanel implements ActionListener, ComponentView {

	private JButton button1;
	private Mediator mediator;
	
	public TopComponent(Mediator mediator) {
		this.mediator = mediator;
		mediator.register(this);
		createUI();
	}
	
	private void createUI() {
		button1 = new JButton();
		button1.addActionListener(this);
		add(button1);
	}
	
	public void updateView(UpdateEvent e) {
		if (e.getEventType() == UpdateEvent.LOAD) {
			System.out.println("Load the data!");
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			mediator.fireUpdate(new UpdateEvent(UpdateEvent.UPDATE));
		}
	}

}
