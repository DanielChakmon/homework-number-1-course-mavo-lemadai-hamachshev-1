import java.util.Scanner;

public class ExerciseOne {
    public static int matchDetector(String outerString, String innerString) {
        int matchIndicator = -1;
        int[] matchPlace=new int[outerString.length()];
        for (int i = 0; i <outerString.length(); i++) {
            if (innerString.charAt(0) == outerString.charAt(i)) {
                matchPlace[i] = 1;
            }
        }
        for(int t=0; t<outerString.length();t++){
            if (matchPlace[t] == 0) {
                continue;
            } else {
                for (int j = 1; j < innerString.length(); j++) {
                    if (innerString.charAt(j) != outerString.charAt(t + j)) {
                        matchIndicator = -1;
                        break;
                    } else {
                        matchIndicator = 1;
                    }
                }
                if (matchIndicator==1){
                    break;
                }
            }
        }
        return matchIndicator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first String (the outer one)");
        String outerString = scanner.nextLine();
        System.out.println("enter your second String (the inner one)");
        String innerString = scanner.nextLine();
        int answer = matchDetector(outerString, innerString);
        if (answer == 1) {
            System.out.println("the second string is contained by the first one");
        } else {
            System.out.println("the second string is NOT contained in the first one");
        }
    }
}
