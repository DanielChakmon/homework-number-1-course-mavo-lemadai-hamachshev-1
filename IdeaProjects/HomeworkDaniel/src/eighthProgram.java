import java.util.Scanner;

public class eighthProgram {
    public static int numberTaker(){
        while (true) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("please enter a number");
            int number=scanner.nextInt();
            if(number>=20 || 5<=number){
                return number;
            }
        }
    }
    public static void pyramidMaker(int number){
        for(int i=0; i<=number;i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
       int number= numberTaker();
       pyramidMaker(number);
    }
}
