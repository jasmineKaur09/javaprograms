import java.util.*;

public class Driver {

	public static void main(String[] args) throws InvalidLoanException {
		Scanner in = new Scanner(System.in);
		BusinessLoan b = null;
		ArrayList<BusinessLoan> arr = new ArrayList<BusinessLoan>();

		// TODO Auto-generated method stub
		System.out.println("Enter S to start of Q to quit");
		String s = in.nextLine();
		while(s.equalsIgnoreCase("S")) {
			System.out.println("enter loan number");
			int lNum = in.nextInt();
			System.out.println("enter loan amount");
			double lAmt = in.nextDouble();
			in.nextLine();
			System.out.println("enter customer last name");
			String lName = in.nextLine();
			b = new BusinessLoan(lNum, lName, lAmt);
			arr.add(b);
			System.out.println("Enter S to start of Q to quit");
			s = in.nextLine();
		}
		
			for(int i =0; i<arr.size();i++) {
			System.out.println(arr.get(i).toString());

			}
			for(int i =0; i<arr.size()-1;i++) {
				System.out.println(arr.get(i).equals(arr.get(i+1)));

				}

			
			
			
	
}


	}


