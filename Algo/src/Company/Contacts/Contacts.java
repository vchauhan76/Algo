package Company.Contacts;

import java.util.*;

class Contacts {

    /*
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */

    //queries = ['add hack', 'add hackerrank', 'find hac', 'find hak']

    public static List<Integer> contacts(List<List<String>> queries) {

        //Write your code here
        Set<String> addName = new HashSet<>();
        List<Integer> operations = new ArrayList<>();
        int findOperationCounter=0;
        String operation;

        for(List<String> entry : queries) {
            operation = entry.get(0);
            if(operation.equals("add")) {
                addName.add(entry.get(2));
            } else {
                if(operation == "find") {
                    findOperationCounter=0;
                    for(String name : addName) {
                        if(name.contains(entry.get(2)))
                            findOperationCounter++;
                    }
                    operations.add(findOperationCounter);
                }
            }

        }
        return operations;


}


    public static void main(String[] args) {

        List<String> firstElement = new ArrayList<>();
        firstElement.add("add");
        firstElement.add(" ");
        firstElement.add("hack");

        List<String> second = new ArrayList<>();
        second.add("add");
        second.add(" ");
        second.add("hackerrank");

        List<String> third = new ArrayList<>();
        third.add("find");
        third.add(" ");
        third.add("hac");

        List<String> fourth = new ArrayList<>();
        fourth.add("find");
        fourth.add(" ");
        fourth.add("hak");


        List<List<String>> queries = new ArrayList<>();
        queries.add(firstElement);
        queries.add(second);
        queries.add(third);
        queries.add(fourth);


        List<Integer> result = Contacts.contacts(queries);

        for(Integer integer : result) {
            System.out.println(integer);
        }


    }
}
