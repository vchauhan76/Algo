import java.util.stream.IntStream;

/**
 * https://www.baeldung.com/java-bubble-sort
 * As we can see, at the end of the first iteration, we got the last element at its rightful place. Now, all we need to do is repeat the same procedure in further iterations. Except, we exclude the elements which are already sorted.
 *
 * In the second iteration, we'll iterate through entire array except for the last element. Similarly, for 3rd iteration, we omit last 2 elements. In general, for k-th iteration, we iterate till index n-k (excluded). At the end of n-1 iterations, we'll get the sorted array.
 *
 * Now that in you understand the technique, let's dive into the implementation.
 */
public class BubbleSort {

    public static void main(String[] args) {

        Integer arr[] = {4,2,1,6,3,5};

        int n = arr.length;
        IntStream.range(0, n - 1) // kind of for loop for(i=0;i<n-1;i++) (0,1,2,3,4,5)
                .flatMap(i -> IntStream.range(1, n - i)) //( {1,2,3,4,5,6}, {1,2,3,4,5},{1,2,3,4},{1,2,3},{1,2},{1})
                .forEach(j -> { //{1,2,3,4,5,6}
                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                });


    }
}
