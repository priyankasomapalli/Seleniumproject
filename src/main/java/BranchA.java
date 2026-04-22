
public class BranchA implements IBank{
	
	public void fundTransfer()
	{
		System.out.println("Fund transfer is done through branchA");
	}
	
	public void deposit()
	{
		System.out.println("Deposit is done through branchA");
	}
	
	public void getMiniStatement()
	{
		System.out.println("This is a method of child");
	}

}
