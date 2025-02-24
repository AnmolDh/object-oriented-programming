public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Anmol", "19920201", 9102.18);

        double currentBalance = bankAccount.getBalance();
        System.out.println(currentBalance);

        bankAccount.deposit(100);
        bankAccount.withdraw(5000);

        currentBalance = bankAccount.getBalance();
        System.out.println(currentBalance);
    }
}