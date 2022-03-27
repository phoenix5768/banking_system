package banking_system;

public class Account{
    private int accountBalance;
    private int accountNumber;

    public void Account() {
        accountBalance = 0;
        accountNumber = 0;
    }

    public void setAccountBalance(int balance) {
        accountBalance = balance;
    }

    public void setAccountNumber(int number) {
        accountNumber = number;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
