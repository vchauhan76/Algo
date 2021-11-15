package Company;

import java.util.Arrays;

public class BubbleSort {


    static int arr[] = {6,4,1};


    public static void main(String[] args) {

        int swapped[] = Arrays.stream(arr).toArray();
        int swappedCounter = 0;


        for(int i=0 ; i < arr.length ; i++) {
            boolean swap = false;
            int nextCounter = i+1;

            if (i+1 != arr.length) {
                if (arr[i] > arr[nextCounter]) {
                    //swapping
                    int temp;
                    swap = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swappedCounter++;
                }

            }
        }
         Arrays.stream(arr).
                 forEach(value -> System.out.println(value));
    }
}
