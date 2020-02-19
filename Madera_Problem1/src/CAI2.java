/*

 */

import java.util.Random;
import java.util.Scanner;

public class CAI2 {
    static int var1 = 0, var2 = 0, correctNum = 0, studentNum = -1, choice;
    static String correctChoices[];
    static String wrongChoices[];
    public static void quiz(){        
        correctChoices = new String[4];
        correctChoices[0] = "Very good!";
        correctChoices[1] = "Excellent!";
        correctChoices[2] = "Nice work!";
        correctChoices[3] = "Keep up the good work!";
        
        
        wrongChoices = new String[4];
        wrongChoices[0] = "No. Please try again.";
        wrongChoices[1] = "Wrong. Try once more.";
        wrongChoices[2] = "Don't give up!";
        wrongChoices[3] = "No. keep trying.";
        
        Random rand = new Random();   
        var1 = rand.nextInt(10);
        var2 = rand.nextInt(10);
        
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
        Random rand = new Random();
        choice = rand.nextInt(4);
        //System.out.println("Made it here");
        System.out.println(correctChoices[choice]);
        System.exit(var1);
    }
    public static void displayIncorrectResponse(){
        Random rand = new Random();
        choice = rand.nextInt(4);
        
        System.out.println(wrongChoices[choice]);
        
        //System.out.println("No. Please try again");
    }
    public static void main(String[] args) {
        // only calls quiz method
        
        quiz();
        //quiz (var1,var2);
    }   
}
