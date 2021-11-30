import java.util.Scanner;

public class ExerciseFour {
    public static int[] duplicatesRemover(int[] userArray) {
        int[] temp = new int[userArray.length];
        boolean duplicateIndicator = false;
        int uniqueNumberCount = 0;
        int zeroCount = 0;
        int nextUnoccupiedCellPlace = 0;
        for (int i = 0; i < userArray.length; i++) {
            duplicateIndicator = false;
            if (userArray[i] == 0) {
                zeroCount++;
                if (zeroCount == 1) {
                    uniqueNumberCount++;
                    temp[nextUnoccupiedCellPlace] = userArray[i];
                    nextUnoccupiedCellPlace++;
                }
                continue;
            } else {
                for (int j = 0; j < temp.length; j++) {
                    if (temp[j] == userArray[i]) {
                        duplicateIndicator = true;
                        break;
                    }
                }
            }
            if (duplicateIndicator == false) {
                uniqueNumberCount++;
                temp[nextUnoccupiedCellPlace] = userArray[i];
                nextUnoccupiedCellPlace++;
            }
        }

        int[] fixedArray = new int[uniqueNumberCount];
        for (
                int t = 0;
                t < uniqueNumberCount; t++) {
            fixedArray[t] = temp[t];
        }
        return fixedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your array size");
        int arraySize = scanner.nextInt();
        int[] userArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("please enter the " + (i + 1) + "st/nd/rd/th number in the array");
            userArray[i] = scanner.nextInt();
        }
        int[] fixedArray = duplicatesRemover(userArray);
        for (int j = 0; j < fixedArray.length; j++) {
            System.out.print(fixedArray[j]);
            if (j != fixedArray.length - 1) {
                System.out.print(" , ");
            }
        }
    }

}
