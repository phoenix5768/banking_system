package banking_system;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private Atm atm;

    public Bank() {
        accounts = new ArrayList<Account>();
        this.atm = new Atm(this);
    }

    public int createAccount() {
        Account acc = new Account();
        acc.setAccountNumber(accounts.size());
        accounts.add(acc);
        return acc.getAccountNumber();
    }

    public Atm getAtm() {
        return atm;
    }

    public int accessAccInfo(int acctNum) throws Exception {
        if(acctNum > accounts.size()) {
            throw new Exception("Error 404. Not Found!");
        } else {
            return accounts.get(acctNum).getAccountNumber();
        }
    }

    public void updateAccBal(int acctNum, int diff) throws Exception {
        if(acctNum > accounts.size()) {
            throw new Exception("Error 404. Not Found!");
        }
        if(accounts.get(acctNum).getAccountBalance() + diff < 0) {
            throw new Exception("Error. Not enough money!");
        }
        int temp = accounts.get(acctNum).getAccountBalance() + diff;
        accounts.get(acctNum).setAccountBalance(temp);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
