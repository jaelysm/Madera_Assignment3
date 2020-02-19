/*
    Jaelys Madera
    COP 3330
 */

import java.util.Random;
import java.util.Scanner;

public class CAI1 {
    static int var1 = 0, var2 = 0, correctNum = 0, studentNum = -1;
    public static void quiz(){
        askQuestion();
    }
    public static void askQuestion(){
        System.out.println("What is " + var1 + " times " + var2 + "?");
        readResponse();
    }
    public static void readResponse(){
        Scanner num = new Scanner(System.in);
        studentNum = num.nextInt();
        isAnswerCorrect();
    }
    public static void isAnswerCorrect(){
        correctNum = var1 * var2;
        while (studentNum != correctNum){
            displayIncorrectResponse();
            askQuestion();
            readResponse();
        }
        if(studentNum == correctNum)
            displayCorrectResponse();
    }
    public static void displayCorrectResponse(){
        System.out.println("Very good!");
        System.exit(var1);
    }
    public static void displayIncorrectResponse(){
        System.out.println("No. Please try again");
    }
    public static void main(String[] args) {
        // only calls quiz method
        Random rand = new Random();
        
        // makes 2 random numbers from 0 to 9
        var1 = rand.nextInt(10);
        var2 = rand.nextInt(10);
        
        quiz();
    }   
}
