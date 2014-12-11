package command;

public class StartCommand implements Command {

	private Engine engine;
	public StartCommand(Engine engine) {
		this.engine = engine;
	}
	
	public void execute() {
		engine.start();
	}
}
