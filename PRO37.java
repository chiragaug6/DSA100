
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create a class BankAccount with attributes like account number, balance,
 * account holder and name. Create an array of BankAccount objects to store
 * bank accounts. Implement methods to deposit money, withdraw money and
 * check balance.
 */

public class PRO37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank sbi = new Bank();

        while (true) {
            System.out.println("=================Bank System==================");
            System.out.println("select 1.create Account");
            System.out.println("select 2.Deposit Account");
            System.out.println("select 3.Withdraw Account");
            System.out.println("select 4.Check Balance");
            System.out.println("select 5.To Exit or any key");

            int op = sc.nextInt();
            if (op < 5 && op > 0) {
                System.out.print("Enter Account Number  ::");
                long accNo = sc.nextLong();
                if (op == 1) {
                    sc.nextLine();
                    System.err.print("Enter Your Name  ::");
                    String name = sc.nextLine();

                    BankAccount ba = new BankAccount(accNo, name);
                    sbi.addBankAccount(ba);

                    System.out.println("Account Created... ");
                } else if (op == 2) {
                    BankAccount selectedAccount = sbi.SelectAccount(accNo);

                    if (selectedAccount != null) {
                        System.out.print("Enter Money you want to deposit :");
                        double money = sc.nextDouble();
                        selectedAccount.depositMoney(money);
                    } else {
                        System.out.println("Please Enter Valid Account Number... ");
                    }
                } else if (op == 3) {
                    BankAccount selectedAccount = sbi.SelectAccount(accNo);
                    if (selectedAccount != null) {
                        System.out.print("Enter Money you want to Withdraw :");
                        double money = sc.nextDouble();
                        selectedAccount.withdrawMoney(money);
                    } else {
                        System.out.println("Please Enter Valid Account Number... ");
                    }
                } else if (op == 4) {
                    BankAccount selectedAccount = sbi.SelectAccount(accNo);
                    if (selectedAccount != null) {
                        System.out.println("Bank Balance ::" + selectedAccount.checkBankBalance());
                    } else {
                        System.out.println("Please Enter Valid Account Number... ");
                    }
                }
            } else {
                System.out.println("Thank You For Using Bank System...");
                break;
            }
            sc.close();
        }
    }
}

class Bank {
    private ArrayList<BankAccount> accounts;

    Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addBankAccount(BankAccount ba) {
        accounts.add(ba);
    }

    public void printAllAccount() {
        for (BankAccount ba : accounts) {
            System.out.println(ba);
        }
    }

    public BankAccount SelectAccount(long accountNumber) {
        for (BankAccount ba : accounts) {
            if (ba.getAccountNumber() == accountNumber) {
                return ba;
            }
        }

        return null;
    }

}

class BankAccount {
    private long accountNumber;
    private double balance = 0;
    private String name;

    BankAccount(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double checkBankBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "[name : " + name + " | Account Number : " + accountNumber + " | balance : " + balance + "]";
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }

}
