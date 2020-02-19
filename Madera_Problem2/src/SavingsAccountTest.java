/*
    Jaelys Madera
    COP 3330
 */
public class SavingsAccountTest extends SavingsAccount{
        static SavingsAccount saver1 = new SavingsAccount();
        static SavingsAccount saver2 = new SavingsAccount();
    public static void main(){
        // instantiates objects for savings accounts for two savers
        double newamt1, newamt2;
        // changes interest rate to 4%
        modifyInterestRate(4);
        
        System.out.println("Interest: 4%");
        // set starting balance amounts and prints amounts after interest
        saver1.setSavingsBalance (2000);
        newamt1 = printBalances1();
        saver2.setSavingsBalance (3000);
        newamt2 = printBalances2();
        
        // do again but interest is now 5%
        modifyInterestRate(5);        
        
        System.out.println("-----------------------------------------------\nInterest: 5%");
        saver1.setSavingsBalance(newamt1);
        printBalances1();
        saver2.setSavingsBalance(newamt2);
        printBalances2();
        
    }
    public static double printBalances1(){
        
        saver1.savingsBalance = calculateMonthlyInterest();
        System.out.printf("Monthly balance for saver1:\t %.2f\n" ,saver1.savingsBalance);
        return saver1.savingsBalance;
    }
    
    public static double printBalances2(){
        saver2.savingsBalance = calculateMonthlyInterest();
        System.out.printf("Monthly balance for saver2:\t %.2f\n", saver2.savingsBalance);
        return saver2.savingsBalance;
    }
    
}
