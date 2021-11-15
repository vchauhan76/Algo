import java.util.*;

public class NewYear {

    //[1,2,3,5,4,6,7,8]

    //[1,2,3,4,5,6,7,8]



    //[2,1,5,3,4]

    //[1,2,3,4,5]


    //[2,5,1,3,4]

    //[1,2,3,4,5]


    /*
       Start from last position.
       now record the position where its found
       for eg: 5th number found at position 3.
       ie 5-3 = 2
        main counter =2 ad 5th number 2 done.

        use hashMap key, value

        next number if its at greater position then its moved to Greater position not ahead only back..then break.

    */

    public static void main(String args[]) {

        //[1,2,3,5,4,6,7,8]--main array
        //[1,2,3,4,5,6,7,8]--sorted array

        List<Integer> mainArr = new ArrayList<>(
                List.of(1,2,3,5,4,6,7,8)
        );
        List<Integer> sortedArr = new ArrayList<>();
        sortedArr.addAll(mainArr);
        Collections.sort(sortedArr);
        Map<Integer,Integer> numberOFShift = new HashMap<>();


        for(int i=sortedArr.size()-1; i>=0; i--) {
            int number  = sortedArr.get(i);
              for(int j=i; j>=0 ;j--) {
                  if(number == mainArr.get(j)) {
                       break;
                  }
                  //next number if its at greater position then its moved
                  // to Greater position not ahead only back..then break.
                  if(j+1 > number){

                      break;
                  }

                  int hops = number - j + 1;
                  numberOFShift.put(number, hops);


              }
        }


       if(numberOFShift.values().contains(3))
       {
           System.out.println("Chaotic");
       }
       else {
           System.out.println(numberOFShift.values().toString());
       }










        
    }




}
