package visitor;

public class LoanAccount extends Account{

	private int paidAmount = 0;
	private int loanAmount = 0;
	
	public LoanAccount() {
		loanAmount = 100000;
	}
	
	public String getAccountType() {
		return "Loan";
	}

	public int getLoanAmount() {
		return loanAmount;
	}
	
	public int getBalance() {
		return balance = loanAmount - paidAmount;
	}

	void accept(Visitor visitor) {
		visitor.visit(this);	
	}

}
