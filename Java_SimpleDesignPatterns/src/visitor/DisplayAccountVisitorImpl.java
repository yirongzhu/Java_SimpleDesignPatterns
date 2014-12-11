package visitor;

public class DisplayAccountVisitorImpl implements Visitor {

	public void visit(CurrentAccount account) {
		System.out.println("Account type: " + account.getAccountType());
		System.out.println("Account Balance: " + account.getBalance());
		System.out.println("Withdrawal Limit: " + account.getWithdrawalLimit());
	}

	public void visit(SavingAccount account) {
		System.out.println("Account type: " + account.getAccountType());
		System.out.println("Account Balance: " + account.getBalance());
	}

	public void visit(LoanAccount account) {
		System.out.println("Account type: " + account.getAccountType());
		System.out.println("Account Balance: " + account.getBalance());
		System.out.println("LoanAmount: " + account.getLoanAmount());
	}
}
