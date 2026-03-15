package lr2;

public interface InterBankAccount {
    void createAccount(String accountNumber, double initialBalance);
    void deposit(double amount);
    void withdraw(double amount);

    double getBalance();
}
