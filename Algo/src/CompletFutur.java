import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletFutur {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread t = new Thread();
        CompletableFuture.supplyAsync(() -> {
           /* try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            return "Hello thre";

        }).thenAccept(product -> {
            System.out.println("Got product detail from remote service " + product );
        });

        //System.out.println(welcomeText.get());




        System.out.println("-------- " +Thread.currentThread().getName());

    }
}
