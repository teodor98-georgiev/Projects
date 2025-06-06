import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialNumber = 3;
        int caseNumber = 0;
        caseNumber = initialNumber;
        int timeInput = scan.nextInt();
        if (timeInput >= 1 && timeInput <= Math.pow(10,12)){
            for (int i = 1; i <= timeInput; i++){
                if (i == 1){
                    continue;
                }
                if (caseNumber != 1){
                    caseNumber = caseNumber - 1;
                }
                else  {
                    initialNumber = initialNumber * 2;
                    caseNumber = initialNumber;
                }
            }
            System.out.println(caseNumber);
        }

    }
}
