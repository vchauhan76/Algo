import java.util.ArrayList;
import java.util.List;

public class RansomNote {


    public static void main(String arg[]) {

        List<String> note = new ArrayList<>(List.of("give","one","grand","today"));
        List<String> magazine = new ArrayList<>(List.of("give","me","one","grand","today","night"));

        for(String noteElement : note) {
            if(magazine.contains(noteElement)) {
                 String magzineword = magazine.get(magazine.indexOf(noteElement));
               if(magzineword.compareTo(noteElement)==0) {
                    magazine.remove(magazine.indexOf(noteElement));
                    note.remove(note.indexOf(noteElement));

               } else {
                   System.out.println("NO");
                   break;
               }
            }  else  {
                System.out.println("NO");
                break;
            }
        }

        System.out.println(magazine.size()==0);

    }

}
