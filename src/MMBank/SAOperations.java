package MMBank;

public class SAOperations {
	// Instance members
	private static final String BANK_NAME = "Money Money Bank";
	private final long account_number = setAccountNo();
	private String name;
	private double initial_Balance;
	private static long nextAccountNumber;

	// getter setters
	public double getInitial_Balance() {
		return initial_Balance;
	}

	public void setInitial_Balance(double initial_Balance) {
		this.initial_Balance = initial_Balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	// Instance memeber
	private double amount;
	private long AccountNo;
	private static int objC = 1;

	public SAOperations() {
		objC = 0;
		objC++;
	}

	// Constructor with name and initial balance
	public SAOperations(String name, double initial_Balance) {
		objC++;
		this.name = name;
		this.initial_Balance = initial_Balance;

	}

	// Constructor with name
	public SAOperations(String name) {
		objC++;
		this.name = name;

	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

		//Generating Account Number
	static long setAccountNo() {
		long accNo = 500000 + objC;
		return accNo;
	}
	
	//Return updated balance after deposit
	double Deposit(double amount) {
		initial_Balance += amount;
		return initial_Balance;
	}
	
	//Return updated balance after withdraw
	double Withdraw(double amount) {
		String withdraw = "";
		if (amount < initial_Balance) {
			initial_Balance -= amount;
			withdraw = "Transaction Successfull!!\n Amount Withdrawl is " + initial_Balance;
		} else {
			withdraw = "Insufficient Balance!!!";
		}
		return initial_Balance;
	}

	public String toString() {
		return BANK_NAME + account_number + "		" + name + "			" + initial_Balance;
	}
	//returns nextAccountNumber 
	public static long getNextAccountNumber() {
		return setAccountNo();
	}

}
