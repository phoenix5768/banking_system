package banking_system;

public class Atm {

    private Bank bank;
    private int currentSession = -1;

    public Atm (Bank bank) {
        this.bank = bank;
    }

    public boolean loginToAccount(int acctNum) {
        if (acctNum > bank.getAccounts().size()) {
            return false;
        } else {
            currentSession = acctNum;
            return true;
        }
    }

    public boolean deposit(int amount) {
        if(currentSession == -1) {
            return false;
        }

        if(amount + bank.getAccounts().get(currentSession).getAccountBalance() < 0) {
            return false;
        }

        int tempMoney = bank.getAccounts().get(currentSession).getAccountBalance() + amount;
        bank.getAccounts().get(currentSession).setAccountBalance(tempMoney);
        return true;
    }

    public boolean withdraw(int amount) {
        if(currentSession == -1) {
            return false;
        }

        if(bank.getAccounts().get(currentSession).getAccountBalance() - amount < 0) {
            return false;
        }

        int tempMoney = bank.getAccounts().get(currentSession).getAccountBalance() - amount;
        bank.getAccounts().get(currentSession).setAccountBalance(tempMoney);
        return true;
    }

    public int getBalance() {
        if(currentSession == -1) {
            return 0;
        }
        return bank.getAccounts().get(currentSession).getAccountBalance();
    }

    public void logout() {
        currentSession = -1;
    }
}
