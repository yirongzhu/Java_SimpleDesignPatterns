package visitor;

public class VisitorPatternTest {

	public static void main(String[] args) {
		DisplayHandler example = new DisplayHandler();
		example.DisplayDetails(new CurrentAccount());
		example.DisplayDetails(new SavingAccount());
		example.DisplayDetails(new LoanAccount());
	}
}
