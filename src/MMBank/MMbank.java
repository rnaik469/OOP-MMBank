package MMBank;

import java.util.Scanner;

public class MMbank {

	void operations(SAOperations opt) {
		int choice = 0;
		Scanner get = new Scanner(System.in);
		int con = 0;
		do {// do while loop
			System.out.println(
					"Account successfully created\nSelect operation below\n1.Deopsit\n2.Withdrawl\n3.Know Your Details\n4.Exit");
			choice = get.nextInt();
			switch (choice) {
			case 1:// deopsit operation
				double amount = 0;
				System.out.println("Enter Amount:");
				amount = get.nextDouble();
				System.out.println("New Balance: 	" + opt.Deposit(amount));
				break;
			case 2:// withdrawl operation
				amount = 0;
				System.out.println("Enter Amount:");
				amount = get.nextDouble();
				System.out.println("New Balance: 	" + opt.Withdraw(amount));
				break;
			case 3:
				System.out.println("Account_Number	Account_Holder_Name	Balance");
				System.out.println(opt);
				break;
			case 4:

				break;
			default:
				break;
			}
			System.out.println("Press 1 to Use this operations again");
			con = get.nextInt();
		} while (con == 1);// end of loop
	}

	public static void main(String[] args) {

		Scanner get = new Scanner(System.in);
		int c = 0, con;
		SAOperations person1=new SAOperations();
		SAOperations  person2=new SAOperations();
		MMbank opt = new MMbank();//Instatiating MMbank class 
		do {

			System.out.println("Welcome to Money Money Bank \nSelect an option:");

			System.out.println(
					"1.Open account with Balance\n2.Open account without Balance\n3.To know next Account Number");
			c = get.nextInt();
			switch (c) {
			case 1:
				String name;
				double amount;
				System.out.println("Enter Your Name");
				name = get.next();
				person1.setName(name);
				
				System.out.println("Enter Amount");
				amount = get.nextDouble();
				person1.setAmount(amount);
				
				person1 = new SAOperations(person1.getName(), person1.getAmount());
				opt.operations(person1);//Invoking operations 
				break;
			case 2:
				
				System.out.println("Enter Your Name");
				name = get.next();
				person2.setName(name);
				person2 = new SAOperations(person2.getName());
				opt.operations(person2);//Invoking operations
				break;
			
			case 3:
				System.out.println("Next Account No. Available" + SAOperations.getNextAccountNumber());
				break;
			
			}
			System.out.println("Press 1 to Open New Account or any other number to exit ");
			con = get.nextInt();
		} while (con == 1);
get.close();
	}
}
