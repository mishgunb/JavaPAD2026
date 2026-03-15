package lr2;

public class Task7 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.createAccount("12345", 10000.0);
        account.deposit(5000.0);
        account.withdraw(2000.0);
        account.withdraw(2000.0);

        System.out.println("Текущий баланс: " + account.getBalance());
        account.displayAccountInfo();
    }
}