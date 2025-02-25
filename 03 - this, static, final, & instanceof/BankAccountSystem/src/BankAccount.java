public class BankAccount {
    private static String bankName = "HDFC";
    private static int totalAccounts = 0;
    private final int accountNumber; //
    private String accountHolderName;
    private double balance;

    public static String getBankName() {
        return bankName;
    }
    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
}
