import java.util.Scanner;

public class fifthProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            int workerRank=0;
          while (true){
            System.out.println("please enter worker's rank: if he/she is a junior worker please enter 0 if he/she is a senior worker please enter 1.");
            int workerRankEntered =scanner.nextInt();
            if(workerRankEntered != 0 && workerRankEntered != 1){
                System.out.println("please enter 1 or 0");
            }
            else {
                workerRank=workerRankEntered;
                break;
            }
            }
            System.out.println("how many hours did the worker worked this month?");
            int hourCount =scanner.nextInt();
            System.out.println("how many days did the worker reached the daily goal this month?");
            int goalCount =scanner.nextInt();
            int salary= salaryCalculator(workerRank,hourCount,goalCount);
            System.out.println(salary);
            int answerForReal=0;
            while (true){
                System.out.println("if you want to enter another worker's info please enter 0 if not enter 1");
                int answer =scanner.nextInt();
                if(answer != 0 && answer != 1){
                    System.out.println("please enter 1 or 0");
                }
                else {
                    answerForReal=answer;
                    break;
                }
            }
            if (answerForReal==1){
                break;
            }
        }
    }
    public static int salaryCalculator(int workerRank,int hourCount,int goalCount){
        int hourlyRate=0;
        if(workerRank==0){
            hourlyRate=50;
        }
        else {
            hourlyRate=200;
        }
        return hourlyRate*hourCount+250*goalCount;
    }

}
