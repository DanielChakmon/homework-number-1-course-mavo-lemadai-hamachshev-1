import java.util.Scanner;

public class ExerciseSix {
    public static int[] intersectionFinder(int[] firstArray, int[] secondArray) {
        int[] temp = new int[secondArray.length];
        int firstUnoccupiedCell = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    temp[firstUnoccupiedCell] = secondArray[j];
                    firstUnoccupiedCell++;
                }
            }
        }
        int[] intersection = duplicatesRemover(temp,(firstUnoccupiedCell-1));
        return intersection;
    }


    public static int[] duplicatesRemover(int[] userArray,int lastRelevantNumberPlace) {
        int[] temp = new int[userArray.length];
        boolean duplicateIndicator = false;
        int uniqueNumberCount = 0;
        int zeroCount = 0;
        int nextUnoccupiedCellPlace = 0;
        for (int i = 0; i < lastRelevantNumberPlace; i++) {
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


    public static boolean strangerChecker(int[] firstArray, int[] secondArray) {
        boolean areTheyStrangers = false;
        int[] intersection = intersectionFinder(firstArray, secondArray);
        if (intersection.length == 0) {
            areTheyStrangers = true;
        } else {
            areTheyStrangers = false;
        }
        return areTheyStrangers;
    }
public static int[] arrayTaker(String arrayName){
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your " +arrayName+ " array size");
    int arraySize = scanner.nextInt();
    int[] takenArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
        System.out.println("please enter the " + (i + 1) + "st/nd/rd/th number in the array");
        takenArray[i] = scanner.nextInt();
    }
    return takenArray;
}
    public static void main(String[] args) {
        int[] firstArray= arrayTaker("first");
        int[] secondArray= arrayTaker("second");
        int[] intersection = intersectionFinder(firstArray, secondArray);
        for (int j = 0; j < intersection.length; j++) {
            System.out.print(intersection[j]);
            if (j != intersection.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ");
           System.out.println("are they strangers? : "+strangerChecker(firstArray,secondArray));
    }
}