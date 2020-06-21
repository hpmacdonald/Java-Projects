public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account2 = new BankAccount();
		account.depositPaper(300.40, "checking account");
		account.depositPaper(5.00, "savings account");
        account.displayAccountBalance();
        account.displayTotalAmount();

        account2.depositPaper(1000.00, "checking account");
		account2.depositPaper(500.00, "savings account");
		account2.withdrawMoney(100.00, "checking account");
		account2.withdrawMoney(170.00, "savings account");
        account2.displayAccountBalance();
        account2.displayTotalAmount();
	}
}