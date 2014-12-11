package command;

// The command design pattern is a behavioral design pattern and is used to represent and encapsulate all the information
// required to call a method at a later time. Command pattern allows the requester to be decoupled from the invoker
// The invoker has no knowledge of the action performed by the receiver. The changes to the receiver will not directly
// affect the invocation of the action.
public interface Command {

	void execute();
}
