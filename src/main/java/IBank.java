
public interface IBank {

	public void fundTransfer();

	public void deposit();
	
	public static final String bankName="SBI";

	public default void getBankName() {
		System.out.println("Bank name is Same for all implemented classes" +bankName);
	}

	public static void getMiniStatement() {
		int val = 1000;

		if (val >= 500)
			System.out.println("Eligible for Printing ministatement");
		else
			System.out.println("Not eligible");
	}

}
