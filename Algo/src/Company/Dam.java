package Company;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;


class Dam {

    /*
     * Complete the 'maxHeight' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY wallPositions
     *  2. INTEGER_ARRAY wallHeights
     */

    public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {

        //wallPosition=[1,2,3,7]
        //wallHeights=[4,4,3,...,...,...,3]

        List<Integer> wallHeight = wallHeights;
        List<Integer> mudHeight = new ArrayList<>();


        for(int i=0; i< wallPositions.size(); i++) {

            int mudHeight1;
            int diff;
            int actualDiif;

            if(wallPositions.get(i) > wallPositions.get(i+1) ) {
                diff = wallPositions.get(i) -  wallPositions.get(i+1);
            } else {
                diff = wallPositions.get(i+1) -  wallPositions.get(i);
            }

            actualDiif = diff - 1;

            //This should run
            //wallPosition=[1,2,3,4,7]
            //wallHeights=[4,4,3,4,3]

            if(actualDiif > 0) {
                if(wallHeight.get(i) < wallHeight.get(i+1)) {
                    mudHeight1 = wallHeight.get(i) + actualDiif;

                }  else {
                    mudHeight1 = wallHeight.get(i+1) + actualDiif;
                }

                mudHeight.add(mudHeight1);
                wallPositions.add(actualDiif, diff);
                wallHeight.add(actualDiif, mudHeight1);

            }


        }

        Collections.sort(mudHeight);

        return mudHeight.get(mudHeight.size()-1);



    }


    public static void main(String args[]) {

        //wallPosition=[1,2,3,7]
        //wallHeights=[4,4,3,3]
        List<Integer> wallPositionn = new ArrayList<>();
        wallPositionn.add(1);
        wallPositionn.add(3);
        wallPositionn.add(7);

        List<Integer> wallHeights = new ArrayList<>();
        wallHeights.add(4);
        wallHeights.add(3);
        wallHeights.add(3);

        int height = Dam.maxHeight(wallPositionn,wallHeights);


    }

}
//https://www.hackerrank.com/interview/interview-preparation-kit?h_l=domains&h_r=hrw&utm_source=hrwCandidateFeedback