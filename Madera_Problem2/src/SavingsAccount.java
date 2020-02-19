/*
    Jaelys Madera
    COP 3330
*/
public class SavingsAccount {

    public static int annualInterestRate;
    public static double savingsBalance;
    public static double calculateMonthlyInterest(){
        // sets new balance after addings interest
        return savingsBalance += (savingsBalance * annualInterestRate / 100 / 12);
    }
    public static void setSavingsBalance(double amt){
        // set amount in savings balance to this class
        savingsBalance = amt;
    }
    public static void modifyInterestRate(int newRate){
        annualInterestRate = newRate;
    }
    public static void main(String[] args) {
        // only calls for tester function
        SavingsAccountTest.main();
    }
}
