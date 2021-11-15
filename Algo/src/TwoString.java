

public class TwoString {

    public static void main(String args[]) {

        String one = "hello";
        String two = "world";
        char chOne[]  = one.toCharArray();
        char chTwo[] = two.toCharArray();

       outerloop:
       for(int i=0 ; i < chOne.length; i++) {
           for(int j=0 ; j < chTwo.length; j++) {
               if(chOne[i]==chTwo[j]) {
                   System.out.println("YES");
                   break outerloop;
               }
           }
        }
    }
}
