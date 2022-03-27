package outside;

import banking_system.Bank;
import outside.Customer;

public class Tester {

    public static void main(String[] args) throws Exception {
        Bank jusan = new Bank();
        Customer one = new Customer (jusan);

        one.openAccount();
        one.depositMoney(100);
        System.out.println(one.checkBalance());
        one.withdrawMoney(32);
        System.out.println(one.checkBalance());
        one.withdrawMoney(6);
        System.out.println(one.checkBalance());

        Customer two = new Customer(jusan);
        two.openAccount();
        two.depositMoney(500);
        two.withdrawMoney(100);
        System.out.println(two.checkBalance());
    }
}
