import java.lang.Math;
import java.util.Random;

public class BankAccount {

	public static int numOfAccounts = 0;
	public static double totalAmount = 0;
	private static String newID() {
		String randAccount = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			randAccount += r.nextInt(10);
		}
		return randAccount;
    }
	public String accountNumber;
	private double checkingBalance;
	private double savingsBalance;

	public BankAccount() {
		BankAccount.numOfAccounts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = BankAccount.newID();
	}
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}

	public double getSavingsBalance() {
		return this.savingsBalance;
	}

	public void depositPaper(double amount, String account) {
		if(account.equals("savings account"))
			this.savingsBalance += amount;
		else if(account.equals("checking account"))
			this.checkingBalance += amount;
		BankAccount.totalAmount += amount;
	}

	public void withdrawMoney(double amount, String account) {
		boolean successful = false;
		if(account.equals("savings account")) {
			if(this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
			}
		}
		else if(account.equals("checking account")) {
			if(this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
			}
		}
		if(successful) {
			BankAccount.totalAmount -= amount;
		}
    }
    public void displayTotalAmount(){
        System.out.println("Your combined Chequing and Savings is: " + BankAccount.totalAmount);
    }

	public void displayAccountBalance() {
		System.out.println(String.format("Savings: " + this.savingsBalance + " Checking: " + this.checkingBalance));
	}
}


