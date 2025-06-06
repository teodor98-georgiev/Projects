import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

// Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//For example, the square matrix  is shown below:
//
//1 2 3
//4 5 6
//9 8 9
//The left-to-right diagonal = .
//The right-to-left diagonal = .
//Their absolute difference is .
//
//Function description
//
//Complete the  function with the following parameter:
//
//: a 2-D array of integers
//Return
//
//: the absolute difference in sums along the diagonals
//Input Format
//
//The first line contains a single integer, , the number of rows and columns in the square matrix .
//Each of the next  lines describes a row, , and consists of  space-separated integers .
//
//Constraints
//  -100 <arr[i][j] < 100
//Sample Input
//
//STDIN      Function
//-----      --------
//3           arr[][] sizes n = 3, m = 3
//11 2 4     arr = [[11, 2, 4], [4, 5, 6], [10, 8, -12]]
//4 5 6
//10 8 -12
//Sample Output
//
//15
public class Main {
    public static void main(String[] args) {
        // matrix size insertion
        Scanner scan = new Scanner(System.in);
        int matrixSize = scan.nextInt();
        // matrix generation
        List<List<Integer>> arr = new ArrayList<>();
        // matrix fill
        for (int i = 0; i < matrixSize; i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < matrixSize; j++){
                int userInput = scan.nextInt();
                row.add(userInput);
            }
            arr.add(row);
        }
        // retrieve of result
        int result = diagonalDifference(arr);
        System.out.println(result);
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        List<Integer> descDiag = new ArrayList<>();
        List<Integer> ascDiag = new ArrayList<>();
        // iterating over desc diagonal top left - bottom right
        for (int r = 0; r < arr.size(); r++){
            for (int c = 0; c < arr.size(); c++){
                if (r == c){
                    descDiag.add(arr.get(c).get(r));
                }
            }
        }
       // iterating over asc diag bottom left - top right
        for (int r = 0; r < arr.size(); r++){
            for (int c = arr.size() - 1; c >= 0; c--){
                if (c == arr.size() - 1 - r){
                    ascDiag.add(arr.get(r).get(c));
                }
            }
        }
     
        int sumDesc = 0;
        int sumAsc = 0;
        int absSum;
        for (int n = 0; n < descDiag.size(); n++){
            sumDesc = sumDesc + descDiag.get(n);
        }
        for (int n = 0; n < ascDiag.size(); n++){
            sumAsc = sumAsc + ascDiag.get(n);
        }
        absSum = Math.abs(sumDesc - sumAsc);
        return absSum;
    }
}
