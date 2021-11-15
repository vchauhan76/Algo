package Company;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median {



    public static List<Float> runningMedian(List<Integer> input) {

           // Collections.sort(input);
            List<Float> medianEntry = new ArrayList<>();
            List<Integer> tempArray = new ArrayList<>();


            //medianEntry.add(Double.valueOf(input.get(0)));
            for(int i=0 ; i< input.size(); i++){
                tempArray.add(input.get(i));
                Collections.sort(tempArray);
                  if ( (tempArray.size() % 2) != 0) {
                      // measn odd
                      medianEntry.add(Float.valueOf(tempArray.get(tempArray.size() / 2)));
                  } else {
                      //means even then add two numbers/2
                      int mid = (tempArray.size() / 2);
                      medianEntry.add(Float.valueOf( (tempArray.get(mid) + tempArray.get(mid - 1))/2));
                  }
            }

            return  medianEntry;




    }



    public static void main(String args[]) throws IOException {

        //BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        //int size = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> inputArray = new ArrayList<>();
        inputArray.add(12);
        inputArray.add(4);
        inputArray.add(5);
        inputArray.add(3);
        inputArray.add(8);
        inputArray.add(7);

        List<Float> result =   Median.runningMedian(inputArray);
        System.out.println(result);


    }

}
