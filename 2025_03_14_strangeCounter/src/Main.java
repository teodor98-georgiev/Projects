import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialNumber = 3;
        int caseNumber = 3;
        int caseDecreased = 0;
        int timeInput = scan.nextInt();
        if (timeInput >= 1 && timeInput <= Math.pow(10,12)){
            for (int i = 2; i < timeInput; i++){
                caseNumber = caseNumber - 1;
                if (caseNumber == 1){
                    caseNumber = initialNumber * 2;
                }
            }
            System.out.println(caseNumber);
        }

    }
}