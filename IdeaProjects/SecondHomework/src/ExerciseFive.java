import java.util.Scanner;

public class ExerciseFive {
    public static int peachPointFinder(int[] userArray) {
        boolean isInDecline = false;
        int peachPoint = -1;
        for (int i = 1; i < userArray.length; i++) {
            if (userArray[i - 1] < userArray[i]) {
                if (isInDecline == true) {
                    peachPoint = -1;
                    break;
                }
                isInDecline = false;
            } else if (userArray[i] != userArray[i - 1]) {
                isInDecline = true;
                peachPoint = i-1;
            } else {
                peachPoint = -1;
                break;
            }
        }
        return peachPoint;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas enter your array size");
        int arraySize = scanner.nextInt();
        int[] userArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("please enter the " + (i + 1) + "st/nd/rd/th number in the array");
            userArray[i] = scanner.nextInt();
        }
        System.out.println(peachPointFinder(userArray));
    }
}
