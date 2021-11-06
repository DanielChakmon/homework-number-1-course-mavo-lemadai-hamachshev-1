import java.util.Scanner;
//we wll consider 0 as even just for the sake of the program.
public class secondProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your first whole number");
        int firstNumber = scanner.nextInt();
        System.out.println("please enter your second whole number");
        int secondNumber = scanner.nextInt();
        double thirdNumber =firstNumber +secondNumber; // didn't call it sum because it would have lost it's meaning later in the code.
            thirdNumber=thirdNumber/2;
            int wholeNumberChecker= (int)(thirdNumber);
        if(wholeNumberChecker==thirdNumber){ //if wholeNumberChecker is equal to thirdNumber than it means that thirdNumber is a whole number which means that the sum of the first and second numbers is even.
            System.out.println("your number is even");
        }
        else{
            System.out.println("your number is odd");
        }

        }
}
