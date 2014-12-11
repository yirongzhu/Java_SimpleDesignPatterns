package visitor;

public class CurrentAccount extends Account {

	private final int maxWithdrawalAmount = 10000;
	
	public CurrentAccount() {
		balance = 500;
	}
	
	public String getAccountType() {
		return "Current";
	}

	public int getWithdrawalLimit() {
		return maxWithdrawalAmount;
	}
	
	void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
