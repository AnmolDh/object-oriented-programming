public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(10211, "Hitesh", 51290);
        BankAccount acc2 = new BankAccount(12391, "Naomki", 34200);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();

    }
}