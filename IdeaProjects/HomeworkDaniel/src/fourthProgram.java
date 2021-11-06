import java.util.Scanner;
public class fourthProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your first number:");
        double firstNumber=scanner.nextDouble();
        System.out.println("please enter your second number:");
        double secondNumber=scanner.nextDouble();
        System.out.println("please enter your third number:");
        double thirdNumber=scanner.nextDouble();
        double determinant=Math.pow(secondNumber, 2)-4*firstNumber*thirdNumber;
        double firstSolution= (-secondNumber+Math.sqrt(determinant))/(2*firstNumber);
        double secondSolution= (-secondNumber-Math.sqrt(determinant))/(2*firstNumber);
        if(determinant>0){
            System.out.println("you have two solutions:");
            System.out.println("X1="+firstSolution);
            System.out.println("X2="+secondNumber);
        }
        else {
            if (determinant==0){
                System.out.println("you have one solution:");
                System.out.println("x="+firstNumber);
            }
            else {
                System.out.println("you do not have a solution.");
            }
        }
    }
}
