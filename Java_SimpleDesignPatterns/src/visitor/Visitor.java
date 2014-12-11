package visitor;

public interface Visitor {

	void visit(CurrentAccount account);
	void visit(SavingAccount account);
	void visit(LoanAccount account);
}
