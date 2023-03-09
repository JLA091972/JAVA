package JAVA.BankAccount;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    //counter for number of accounts opened
    public static int totalAccounts = 0;
    //counter for total deposits
    public static double totalDeposit = 0;
    //counter for individual account balance
    public static double accountBalance = 0;
    //random 10 digit account number
    public long  accountNumber = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {
        System.out.println("\nNew Bank Account opened!!");
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        BankAccount.totalAccounts ++;
        this.accountNumber = createAccountNumber(1000000000L, 9999999999L);
        System.out.println(accountNumber);

        
        // totalDeposit = checkingBalance + savingsBalance;
    }

    @Override
    public String toString() {
        return "{" +
                " checkingBalance='" + getCheckingBalance() + "'" +
                ", savingsBalance='" + getSavingsBalance() + "'" +
                ", accountNumber='" + accountNumber + "'" +
                "}";
    }

    //deposit money to any account
    public void deposit(String account, double amount) {
        account = account.toLowerCase();
        switch (account) {
            case "checking": {
                System.out.println("Deposit to Checking: " + amount);
                this.checkingBalance += amount;
                break;
            }

            case "savings": {
                System.out.println("Deposit to Savings: " + amount);
                this.savingsBalance += amount;
                break;
            }
            default:
                System.out.println("Invalid account, use either 'checking' or 'savings'");
        }
        accountBalance = this.checkingBalance + this.savingsBalance;
        System.out.println("Total Account Balance :" + accountBalance);
    }

    //withdraw money to any account
    public void withdraw(String account, double amount) {
        account = account.toLowerCase();
        switch (account) {
            case "checking": {
                System.out.println("Withdraw from Checking: " + amount);
                if (this.checkingBalance >= amount){
                    this.checkingBalance -= amount;
                } else {
                    System.out.println("Insufficient funds to witdraw from Checking");
                }
                break;
            }
            case "savings": {
                System.out.println("Withdraw from Savings: " + amount);
                if (this.savingsBalance >= amount){
                    this.savingsBalance -= amount;
                } else {
                    System.out.println("Insufficient funds to witdraw from Savings");
                }
                
                // this.totalDeposit = this.savingsBalance + amount;
                break;
            }
            default:
                System.out.println("Invalid account, use either 'checking' or 'savings'");
        }
        accountBalance = this.checkingBalance + this.savingsBalance;
        System.out.println("Total Account Balance :" + accountBalance);
    }

    public long createAccountNumber(long min, long max) {
        return (long) ((Math.random() * (max - min)) + min);
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

}
