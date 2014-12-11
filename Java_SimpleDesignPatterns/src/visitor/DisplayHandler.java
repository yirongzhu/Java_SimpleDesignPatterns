package visitor;

public class DisplayHandler {

	public void DisplayDetails(Account account) {
		DisplayAccountVisitorImpl visitor = new DisplayAccountVisitorImpl();
		account.accept(visitor);
	}
}
