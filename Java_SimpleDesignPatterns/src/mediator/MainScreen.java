package mediator;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainScreen extends JFrame {

	private Mediator mediator;
	
	public MainScreen() {
		super();
		mediator = new Mediator();
	}
	
	public void createUI() {
		TopComponent c1 = new TopComponent(mediator);
		LeftComponent c2 = new LeftComponent(mediator);
		
		getContentPane().add(c1, BorderLayout.PAGE_START);
		getContentPane().add(c2, BorderLayout.LINE_START);
	}
	
	public static void main(String[] args) {
		MainScreen mainScreen = new MainScreen();
		mainScreen.createUI();
		mainScreen.setVisible(true);
	}
}
