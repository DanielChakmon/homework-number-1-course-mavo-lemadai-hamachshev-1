import java.util.Scanner;

public class sixthProgram {
    public static void arithmeticProgressionCreator(double firstMember, double difference, int size){
      double[] arithmeticProgression=new double[size];
        for (int i=0;i<size;i++){
            arithmeticProgression[i]=firstMember+i*difference;
            System.out.print(arithmeticProgression[i]);
            if(i!=size-1){
                System.out.print(",");
            }
        }
    }
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the first member of the arithmetic progression: ");
        double firstMember=scanner.nextDouble();
        System.out.println("please enter the difference:");
        double difference=scanner.nextDouble();
        int size=0;
        while (true) {
            System.out.println("please enter the size of the arithmetic progression:");
            double enteredSize=scanner.nextDouble();
            size=(int)enteredSize;
            if (size==enteredSize&& size>0){
                break;
            }
        }
        arithmeticProgressionCreator(firstMember,difference,size);
    }
}
