import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        final int How_Much_Numbers = 10;
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[How_Much_Numbers];
        for (int i = 0; i < How_Much_Numbers; i++) {
            System.out.println("enter your " + (i + 1) + "st/nd/rd/th number:");
            userNumbers[i] = scanner.nextInt();
        }
        double sum = 0;
        for (int j = 0; j < How_Much_Numbers; j++) {
            sum = sum + userNumbers[j];
        }
        double doubledHowMuchNumbers = How_Much_Numbers; //if I would not save the value as double the average would get rounded down to a whole number.
        //if I were to save How_Much_Numbers as a double I would not be able to use it at line 7.
        double average = sum / doubledHowMuchNumbers;
        for (int t = 0; t < How_Much_Numbers; t++) {
            if (userNumbers[t] > average) {
                System.out.println(userNumbers[t]);
            }
        }
    }
}
