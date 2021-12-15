
public class Loan implements LoanConstants {
	protected int loanNum;
	protected String cusLname;
	protected double loanAmt;
	boolean flag = false;
	public Loan (int loanNum, String cusLname, double loanA) throws InvalidLoanException{
		this.loanNum = loanNum;
		this.cusLname = cusLname;
		setLoanAmt(loanA);		
	}
	
	public void setLoanAmt(double loanAmt)throws InvalidLoanException {
		if(loanAmt > maxloanVal) {
		throw new InvalidLoanException();
		}
	}

	public int getLoanNum() {
		return loanNum;
	}
	public String getCusLname() {
		return cusLname;
	}
	public double getLoanAmt() {
		return loanAmt;
	}
	
}
