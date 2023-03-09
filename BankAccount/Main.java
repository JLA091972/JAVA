package JAVA.BankAccount;

public class Main {
    public static void main(String[] args) {
        //clear console
        // System.out.print("\033\143");

        BankAccount account = new BankAccount(100, 100);
        System.out.println(account);

        account.deposit("checking", 100);
        System.out.println(account);
        
        account.deposit("savings", 150);
        System.out.println(account);
        
        account.withdraw("checking", 50);
        System.out.println(account);
        account.withdraw("savings", 50);
        System.out.println(account);


        BankAccount TestBankAccount = new BankAccount(200, 200);
        TestBankAccount.deposit("checking", 10);
        System.out.println(TestBankAccount);
        
        TestBankAccount.deposit("savings", 50);
        System.out.println(TestBankAccount);
        
        TestBankAccount.withdraw("checking", 50);
        System.out.println(TestBankAccount);
        TestBankAccount.withdraw("savings", 50);
        System.out.println(TestBankAccount);

        System.out.println("\nTotal Number of active accounts: " + BankAccount.totalAccounts);
    }
}
