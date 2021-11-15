package Company;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strms {

    public static void main(String args[]) {

        List<String> arrString = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        List<Integer> num = Arrays.asList(9, 10, 3, 4, 7, 3, 4);


        List<String> arrList1 = Arrays.asList("One","Two","Three");
        List<String> arrList2 = Arrays.asList("Four","Five","Six");
        List<String> arrList3 = Arrays.asList("Seven","Eight","Nine");


       System.out.println(Stream.of(arrList1, arrList2, arrList3 )
                .flatMap( arrList -> arrList.stream())
                .peek( arlst -> System.out.println("Element in flattened list " + arlst.toString()))
                .collect(Collectors.toList()).toString());



        System.out.println("Count of empty string " + arrString.stream().
                filter(s -> s.isEmpty())
                .count());

        System.out.println( "Non Empty Strings: " +arrString.stream()
        .filter( str -> !str.isEmpty())
                .collect(Collectors.toList())
                .toString());


        System.out.println("Uppercase and join with," + arrString.stream()
        .map(str -> str.toUpperCase())
        .collect(Collectors.joining(",")));

        System.out.println("Square of all distinct numbers." +
                 num.stream()
                .map(number -> number *  number)
                         .distinct()
                .collect(Collectors.toList()).toString());
    }




}
