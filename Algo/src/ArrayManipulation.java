import java.util.*;

public class ArrayManipulation {

    public static void main (String args[]) {

        List<Integer> mainArr = new ArrayList<>(List.of(0,0,0,0,0,0,0,0,0,0));

        Queue<List<Integer>> queriesArr = new LinkedList<>();
        List<Integer> output = new ArrayList<>();


        //a,b,k
        queriesArr.add(List.of(1,5,3));
        queriesArr.add(List.of(4,8,7));
        queriesArr.add(List.of(6,9,1));

        for(int i=0; i <= queriesArr.size(); i++) {

            List<Integer> query = queriesArr.poll();
            for (int j = query.get(0); j <= query.get(1); j++) {
                int toAdd = query.get(2);
                mainArr.set(j-1, mainArr.get(j-1)+toAdd);
            }
            List<Integer> tempArr = new ArrayList<>();
            tempArr.addAll(mainArr);
            Collections.sort(tempArr);
            output.add(tempArr.get(tempArr.size()-1));
        }

        }
}
