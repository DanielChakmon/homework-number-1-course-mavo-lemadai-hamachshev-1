import java.util.Scanner;

public class ExerciseThree {

    public static boolean numberChecker(char charAtI) {
        boolean isANumber = false;
        if ((int) charAtI >= 48 && 57 >= (int) charAtI) {
            isANumber = true;
            return isANumber;
        }
        return isANumber;
    }

    public static String formatConvertor(String phoneNumber) {
        String fixedNumber = new String();
        int firstInterestingNumberPlace = 0;
        switch (phoneNumber.length()) {
            case 10: {
                firstInterestingNumberPlace = 2;
                break;
            }
            case 11: {
                firstInterestingNumberPlace = 3;
                break;
            }
            case 12: {
                firstInterestingNumberPlace = 4;
                break;
            }
        }
        fixedNumber = "05" + phoneNumber.charAt(firstInterestingNumberPlace) + "-";
        for (int t = firstInterestingNumberPlace + 1; t < phoneNumber.length(); t++) {
            fixedNumber = fixedNumber + phoneNumber.charAt(t);
        }
        return fixedNumber;
    }

    public static String validnessCheckerAndFixer(int number, String phoneNumber) {
        boolean isANumber = false;
        String emptyString = "";
        for (int i = number; i < phoneNumber.length() - number; i++) {
            isANumber = numberChecker(phoneNumber.charAt(i));
            if (isANumber == false) {
                return emptyString;
            }
        }
        return formatConvertor(phoneNumber);
    }

    public static String formatSorterAndFixer(String phoneNumber) {
        String emptyString = "";
        switch (phoneNumber.length()) {
            case 10:
                if (phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '5') {
                    int number = 2;
                    return validnessCheckerAndFixer(number, phoneNumber);
                } else {
                    return emptyString;
                }
            case 11: {
                if (phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '5' && phoneNumber.charAt(3) == '-' && true == numberChecker(phoneNumber.charAt(2))) {
                    for (int i = 4; i < phoneNumber.length() - 4; i++) {
                        int number = 4;

                        if (false == numberChecker(phoneNumber.charAt(i))) {
                            return emptyString;
                        }

                    }
                    return phoneNumber;
                } else {
                    return emptyString;
                }
            }

            case 12: {
                if (phoneNumber.charAt(0) == '9' && phoneNumber.charAt(1) == '7' && phoneNumber.charAt(2) == '2' && '5' == phoneNumber.charAt(3)) {
                    for (int i = 2; i < phoneNumber.length() - 2; i++) {
                        int number = 4;
                        return validnessCheckerAndFixer(number, phoneNumber);
                    }
                } else {
                    return emptyString;
                }
            }
            default: {
                return emptyString;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a phone number");
        String fixedPhoneNumber = formatSorterAndFixer(scanner.nextLine());
        System.out.println(fixedPhoneNumber);
    }
}


