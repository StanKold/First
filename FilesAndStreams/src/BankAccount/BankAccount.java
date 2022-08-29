package BankAccount;

public class BankAccount {
    private static int count=0;
    private int Id ;
    public double Balance;
    private static double interest = 0.02;

    public BankAccount(double balance) {
        count++;
        this.Balance = balance;
        this.Id = count;
    }


    public int getId() {
        return Id;
    }


    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance += balance;
    }







    public static double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        BankAccount.interest = interest;
    }





}
