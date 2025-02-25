public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        setBalance(balance);
    }

    public void display() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + getBalance());
    }
}
