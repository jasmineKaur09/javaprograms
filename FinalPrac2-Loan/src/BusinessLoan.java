
public class BusinessLoan extends Loan {
	protected double intRate;
	public BusinessLoan(int loanNum, String cusLname, double loanAmt) throws InvalidLoanException {
		super(loanNum, cusLname, loanAmt);
		this.intRate = 0.0299; 
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "intRate=" + intRate + ", loanNum=" + loanNum + ", cusLname=" + cusLname + ", loanAmt="
				+ loanAmt;
	}

	/*
	 * public String toString(BusinessLoan b) { return("Loan Number " + loanNum +
	 * "\nCustomer Last name " + cusLname + "\nLoan Amount " + loanAmt +
	 * "\nIntrest rate " + intRate + "\n"); }
	 */
	
	public double getIntRate() {
		return intRate;
	}
	
	@Override
	 public  boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof BusinessLoan)) {
            return false;
        }
        
        BusinessLoan c = (BusinessLoan) o;

        return Double.compare(loanNum, c.loanNum) == 0;
    }
}
