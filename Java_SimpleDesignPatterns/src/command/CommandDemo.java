package command;

// This is the invoker.
public class CommandDemo {

	public static void main(String[] args) {
		Engine engine = new Engine();
		Command StartCommand = new StartCommand(engine);
		Command StopCommand = new StopCommand(engine);
		
		Button button = new Button(null);
		button.setCommand(StartCommand);
		button.click();
		button.setCommand(StopCommand);
		button.click();
	}
}
