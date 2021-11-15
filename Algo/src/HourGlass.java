import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HourGlass {

  static   int subSumArray[][] = new int[4][4];
   static List<Integer> integers = new ArrayList<>();


    public static void main(String args[]) {

        int arr[][] = {
                {-9, -9, -9,  1, 1, 1},
                {0, -9,  0,  4, 3, 2 },
                {-9, -9, -9,  1, 2, 3 },
                {0,  0,  8,  6, 6, 0 },
                {0,  0,  0, -2, 0, 0 },
                {0,  0,  1,  2, 4, 0 }
        };
        int subArray[][]=null;

        for(int i=0; i <=3; i++) {
             for(int j=0; j <=3; j++ ) {
                  subArray = new int[3][3];
                 for (int row = 0; row <= 2; row++) {
                     for (int col = 0; col <= 2; col++) {
                         subArray[row][col] = arr[i + row][j + col];
                     }
                 }
                 sumArr(subArray);
             }
        }

        System.out.println(Arrays.deepToString(subArray));
        System.out.println(integers.get(integers.size()-1));
    }

    public static void sumArr(int arr[][]) {

        int sum =0;
        int row =0,col =0;
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length ; j++) {
                  if(i==1) {
                      sum = sum + arr[1][1];
                      break;
                  } else {
                      sum = sum + arr[i][j];
                  }

            }
        }

        integers.add(sum);
        Collections.sort(integers);

    }


}
