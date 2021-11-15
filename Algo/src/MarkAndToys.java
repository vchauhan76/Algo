import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MarkAndToys {



public static void main(String[] args) {

        Integer[] items = {1,2,3,4};
        final Integer cash = new Integer(7);

            Arrays.sort(items);
            int count = 0;
    List<Integer> arList =  List.of(items);

                      arList.stream()
                             .forEach( integer -> {
                                  int remcash = cash-integer;
                                     }

                             );




           /* for (int i = 0; i < items.length; i++) {
                if (cash - items[i] > 0) {
                    cash -= items[i];
                    count += 1;
                } else {
                    break;
                }
            }

            System.out.println(count);
*/
    }
}
