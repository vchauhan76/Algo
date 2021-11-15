import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Child extends Parent {

    int a =1;

    protected Child() {
        System.out.println("Protected constructor....");
    }

    @Override
    public void print(Parent child) {
        System.out.println("Child");

    }


    public static void main(String args[])
    {

        // Here since child has both methods from parent as well hence arguments are exact match

           /* Child p = new Child();
            p.print(new Parent());

            Child child = new Child();
            child.print(new Parent());

            Parent p1 = new Child();
            p1.print(new Child());*/

        Set<Parent> pp = new HashSet<>();

        Parent p1 = new Parent();
        Parent p2 = p1;

        pp.add(p1);
        pp.add(p2);

        System.out.println(String.valueOf(pp.size()));




        Parent p = new Parent();
        p.print(new Child());

        Child c = new Child();
        System.out.println(c.a);



    }
}
