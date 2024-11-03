import java.util.ArrayList;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(String accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

public class BankExample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("123456", 1000);
        Account account2 = new Account("654321", 2000);
        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.displayAccounts();
        account1.deposit(500);
        account2.withdraw(2500); // Insufficient funds
        bank.displayAccounts();
    }
}

/*
Output:
Account Number: 123456, Balance: 1000.0
Account Number: 654321, Balance: 2000.0
Account Number: 123456, Balance: 1500.0
Account Number: 654321, Balance: 2000.0
*/
