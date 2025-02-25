public class BankAccount {
    public String accountNumber;
    protected String accountHolderName;
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(){

    }
}
