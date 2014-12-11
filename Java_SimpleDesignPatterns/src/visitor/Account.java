package visitor;

public abstract class Account {

	protected int balance;
	public abstract String getAccountType();
	public int getBalance() {
		return balance;
	}
	
	abstract void accept(Visitor visitor);
}
