public class Main {
    public static void main(String[] args) {
        //declaring and initializing array
        int[] arr = {5,2,7,6,3,1,4};
        //ordering data;
        for (int i = 0; i < arr.length; i++){
            int candidateMin = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                int currentElement = arr[j];
                if (arr[j] < candidateMin){
                    arr[i] = currentElement;
                    arr[j] = candidateMin;
                    candidateMin = arr[i];
                }
            }

        }
        int lowerLimit = 0;
        int higherLimit = arr.length - 1;
        // what I search
        int key = 100;
        // in case the number isn't found a checker must signalize that number seeked doesn't exist
        int checker = 0;
        // start binary search
        while (lowerLimit <= higherLimit) {
            int mid = lowerLimit + (higherLimit - lowerLimit) / 2;

            // Check if x is present at mid
            if (arr[mid] == key) {
                checker = 1;
                break;
            }

            // If x greater, ignore left half
            if (arr[mid] < key) {
                lowerLimit = mid + 1;
            }

                // If x is smaller, ignore right half
            else
                higherLimit = mid - 1;
        }
        if (checker == 1){
            System.out.println(key);
        }
        else {
            System.out.println("sorry current number is not available");
        }
    }
}