package command;

public class StopCommand implements Command {

	private Engine engine;
	public StopCommand(Engine engine) {
		this.engine = engine;
	}
	
	public void execute() {
		engine.stop();
	}
}
