import java.util.Scanner;

public class seventhProgram {
    public static int hourApprover(int openingHour, int closingHour) {
        int dummyVariable=0; //I used it to break the function.
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the earliest hour you can come?");
        int earliestHour = scanner.nextInt();
        System.out.println("what is the latest hour you can come?");
        int latestHour = scanner.nextInt();
        if (earliestHour<+ latestHour){
            System.out.println("your earliest hour must be before the latest");
            return dummyVariable;
        }
        if(earliestHour<0 || latestHour>23){
            System.out.println("please choose a valid hour");
            return dummyVariable;
        }
        if (earliestHour>=openingHour && latestHour<=closingHour){
            System.out.println("your appointment has been scheduled");
            return dummyVariable;
        }
        else {
            System.out.println("the office is closed in the selected hour");
            return dummyVariable;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of the day");
        int day=scanner.nextInt();
        int practicalDay;
        practicalDay=day;
        if (day==1 || day==2 || day==4 ||day==5){
            practicalDay=1;
        }
        if (day==6||day==7){
            practicalDay=6;
        }
        int openingHour=0;
        int closingHour=0;
        switch (practicalDay) {
            case 1:
                openingHour = 9;
                closingHour = 17;
               int dummyVariable= hourApprover(openingHour,closingHour);
                break;
            case 3:
                openingHour = 8;
                closingHour = 12;
                int dummyVariableSecond= hourApprover(openingHour,closingHour);
                break;
            case 6:
                System.out.println("the office closed in these hours");
                break;
            default:
                System.out.println("please enter a valid day");
                break;
        }
        }
    }


