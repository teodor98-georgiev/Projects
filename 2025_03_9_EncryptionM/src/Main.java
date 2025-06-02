import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int s = sentence.length();
        if (s <= 81 && s >= 1){
            String[] cleanSentence = sentence.split("[!,\\.\\^\\$\\*\\+\\s]+");
            List<String> words = new ArrayList<>();
            for (int i = 0; i < cleanSentence.length; i++){
                words.add(cleanSentence[i]);
            }
            List<Character> wordsChar = new ArrayList<>();
            for (String word : words){
                for (Character c : word.toCharArray()){
                    wordsChar.add(c);
                }
            }
            int L = wordsChar.size();
            double matrixDim = Math.sqrt(L);
            double matrixDimRoun = Math.round(matrixDim * 100.00)/100.00;
            // generation of matriced sentence
            double rowNumb = Integer.MIN_VALUE;
            double colNumb = Integer.MIN_VALUE;
            if ((matrixDimRoun * 100) % 100 != 0){
                rowNumb = ((matrixDimRoun * 100) - ((matrixDimRoun * 100) % 100))/100;
                colNumb = (((matrixDimRoun * 100) - ((matrixDimRoun * 100) % 100))/100) + 1;
            }
            else {
                rowNumb = colNumb = matrixDimRoun;
            }
            if (rowNumb * colNumb >= L){
                List<List<Character>> firstEncMatrix = new ArrayList<>();
                int posWordsChar = 0;
                for (int r = 0; r < rowNumb; r++){
                    List<Character> row = new ArrayList<>();
                    for (int c = 0; c < colNumb; c++){
                        if (posWordsChar >= L ){
                            break;
                        }
                        row.add(wordsChar.get(posWordsChar));
                        posWordsChar++;
                    }
                    firstEncMatrix.add(row);
                }
                // sometimes matrix is not square, so we need a signalizer to the loop to ignore the missing character.
                // to do so by default always last row missес characters and for this reason I take out it,modify
                // and reinsert it with signalizers, in this case with empty character ' ';
                List<Character> lastElement = firstEncMatrix.get(firstEncMatrix.size() - 1);
                if (lastElement.size() < colNumb){
                    for(int y = lastElement.size() + 1; y <= colNumb; y++){
                        lastElement.add(' ');
                    }
                }
                firstEncMatrix.set(firstEncMatrix.size() - 1, lastElement);
                // retrievement of encoded message via reading each column of obtained matrix
                String pieceMatCol = "";
                List<String> toPrint = new ArrayList<>();
                for (int col = 0; col < colNumb; col++){
                    for (int row = 0; row < rowNumb; row++){
                        char colChar = firstEncMatrix.get(row).get(col);
                        if (colChar == ' '){
                            continue;
                        }
                        pieceMatCol = pieceMatCol + colChar;
                    }
                    toPrint.add(pieceMatCol);
                    pieceMatCol = "";
                }
                for (int i = 0; i < toPrint.size();i++){
                    System.out.print(toPrint.get(i) + " ");
                }
            }

            else {
                rowNumb = rowNumb + 1;
                //creation of matriced text;
                List<List<Character>> firstEncMatrix = new ArrayList<>();
                int posWordsChar = 0;
                for (int r = 0; r < rowNumb; r++){
                    List<Character> row = new ArrayList<>();
                    for (int c = 0; c < colNumb; c++){
                        if (posWordsChar >= L ){
                            break;
                        }
                        row.add(wordsChar.get(posWordsChar));
                        posWordsChar++;
                    }
                    firstEncMatrix.add(row);
                }
                // sometimes matrix is not square, so we need a signalizer to the loop to ignore the missing character.
                // to do so by default always last row missес characters and for this reason I take out it,modify
                // and reinsert it with signalizers, in this case with empty character ' ';
                List<Character> lastElement = firstEncMatrix.get(firstEncMatrix.size() - 1);
                if (lastElement.size() < colNumb){
                    for(int y = lastElement.size() + 1; y <= colNumb; y++){
                        lastElement.add(' ');
                    }
                }
                firstEncMatrix.set(firstEncMatrix.size() - 1, lastElement);
                // retrievement of encoded message via reading each column of obtained matrix
                String pieceMatCol = "";
                List<String> toPrint = new ArrayList<>();
                for (int col = 0; col < colNumb; col++){
                    for (int row = 0; row < rowNumb; row++){
                        char colChar = firstEncMatrix.get(row).get(col);
                        if (colChar == ' '){
                            continue;
                        }
                        pieceMatCol = pieceMatCol + colChar;
                    }
                    toPrint.add(pieceMatCol);
                    pieceMatCol = "";
                }
                for (int i = 0; i < toPrint.size();i++){
                    System.out.print(toPrint.get(i) + " ");
                }
            }
        }
    }
}