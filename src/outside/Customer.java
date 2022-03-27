package outside;

import banking_system.Bank;

public class Customer {
    private Bank bank;
    private int cur;

    public Customer(Bank bank) {
        this.bank = bank;
    }

    public void openAccount() {
        cur = bank.createAccount();
    }

    public void depositMoney(int amount) {
        bank.getAtm().loginToAccount(cur);
        bank.getAtm().deposit(amount);
        bank.getAtm().logout();
    }

    public void withdrawMoney(int amount) throws Exception{
        bank.getAtm().loginToAccount(cur);
        boolean temp = bank.getAtm().withdraw(amount);
        if (temp == false)
                throw new Exception("Not enough money!");
        bank.getAtm().logout();
    }

    public int checkBalance() {
        bank.getAtm().loginToAccount(cur);
        return bank.getAtm().getBalance();
    }

}
