import java.util.Scanner;

public class ninthProgram {
    public static int divisorChecker(double number, double possibleDivisor) {
        double quotient = (number)/(possibleDivisor);
        int wholeQuotient = (int) quotient;
        int divisorIndicator = 0;
        if (wholeQuotient == quotient) {
            divisorIndicator = 1;
            return divisorIndicator;
        } else {
            return divisorIndicator;
        }
    }
    public static int primeChecker(int number){
        int primeIndicator=1;
        for(int i=2;i<number;i++){
            int divisorIndicator =divisorChecker(number,i);
            if (divisorIndicator==1){
                primeIndicator=0;
                return primeIndicator;
            }
        }
        return primeIndicator;
    }
    public static int numberTaker(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("please enter a whole positive number");
            double userNumber=scanner.nextDouble();
            int wholeUserNumber=(int)userNumber;
            if (userNumber>0&&wholeUserNumber==userNumber){
                return wholeUserNumber;
            }
        }
    }
    public static void main(String[] args){
        int userNumber = numberTaker();
        for(int i=2; i<=userNumber; i++){
            int primeIndicator=primeChecker(i);
            if (primeIndicator==1){
                System.out.println(i);
            }
        }
    }
}
