package Final_Static.tugas_2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Error: Cannot override 'displayAccountInfo()' in 'FinalStatic.Tugas2.BankAccount';overriden method is final
    // @Override
    // public void displayAccountInfo() {
    //     System.out.println("Savings Account - Info:");
    //     super.displayAccountInfo();
    // }

    public void displayCustomInfo() {
        System.out.println("Savings Account Details (custom):");
        System.out.println("Balance: $" + balance);
    }
}


