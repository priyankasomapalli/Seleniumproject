
public class TestInterface {

	public static void main(String[] args) {
		IBank bank = new BranchA();

		bank.getBankName();

		bank.deposit();

		IBank.getMiniStatement();

		BranchA a = new BranchA();

		a.getBankName();

		a.deposit();
		
		IBank b=new BranchB();
		
		b.deposit();
		
		b.fundTransfer();
		
		b.getBankName();
		
		

	}

}
