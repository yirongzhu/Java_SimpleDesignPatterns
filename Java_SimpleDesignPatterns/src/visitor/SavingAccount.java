package visitor;

public class SavingAccount extends Account {

	public SavingAccount() {
		balance = 1000;
	}
	
	public String getAccountType() {
		return "Saving";
	}

	void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
