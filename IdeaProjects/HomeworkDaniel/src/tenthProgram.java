import java.lang.Math;
import java.util.Scanner;

public class tenthProgram {
    public static int numberChecker(int secretNumber, int userNumber, int whichPlayer, int guessNumber){
    int winingIndicator=0;
        if(secretNumber==userNumber){
            System.out.println("player number:"+ whichPlayer+"got the secret number correct with:"+guessNumber+" guesses!"); //the guess number is referring to number of guesses the individual player made and not to the guesses made by both.
            winingIndicator=1;
            return winingIndicator;
        }
        else{
            if (secretNumber>userNumber){
                System.out.println("the secret number is larger than:"+userNumber);
            }
            else {
                System.out.println("the secret number is lower than:"+userNumber);
            }
        }
        return winingIndicator;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int secretNumber = (int) (1 + 1000 * Math.random());
        int guessNumber=0;
        int whichPlayer=0;
        while (true) {
            guessNumber++;
            if (whichPlayer==0||whichPlayer==2){
                whichPlayer=1;
            }
            else {
                whichPlayer=2;
            }
            System.out.println("player"+whichPlayer+", please enter your guess:");
            int playerNumber=scanner.nextInt();
            int result=numberChecker(secretNumber, playerNumber, whichPlayer, guessNumber);
            if (result==1){
                break;
            }
        }
    }
}
