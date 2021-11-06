import java.util.Scanner;

public class firstProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a whole number");
        int userNumber = scanner.nextInt();
        if (userNumber >= 0) {
            System.out.println(userNumber);
        }
        else {
            System.out.println(-userNumber);
        }

    }
}
