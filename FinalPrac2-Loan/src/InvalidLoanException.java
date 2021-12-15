
public class InvalidLoanException extends Exception {

	public InvalidLoanException() {
		super("Loan is not allowed above $100,000");
	}
}
