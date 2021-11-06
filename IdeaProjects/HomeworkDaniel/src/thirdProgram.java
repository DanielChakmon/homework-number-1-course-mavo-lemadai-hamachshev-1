import java.util.Scanner;
public class thirdProgram {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your first whole number:");
        int firstNumber=scanner.nextInt();
        System.out.println("please enter your second whole number:");
        int secondNumber=scanner.nextInt();
        System.out.println("please enter your third whole number:");
        int thirdNumber=scanner.nextInt();
        if (firstNumber>=secondNumber){
            if (secondNumber>=thirdNumber){
                System.out.println(firstNumber + "," + secondNumber +","+ thirdNumber);
            }
            else {
                if(firstNumber>=thirdNumber){
                System.out.println(firstNumber + "," +thirdNumber+","+ secondNumber);
            }
                else {
                    System.out.println(thirdNumber+","+firstNumber+","+secondNumber);
                }
            }

        }
        else {
            if (secondNumber>=thirdNumber){
                if(thirdNumber>=firstNumber){
                    System.out.println(secondNumber+","+thirdNumber+","+firstNumber);
                }
                else {
                    System.out.println(secondNumber+","+firstNumber+","+thirdNumber);
                }
            }
            else {
                System.out.println(thirdNumber+","+secondNumber+","+firstNumber);
            }

        }
    }
}
