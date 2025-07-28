import java.util.concurrent.*;

public class Collable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService execute= Executors.newSingleThreadExecutor();
//
//        Callable<String> callable= ()->"hello" ;
//       Future<String> future= execute.submit(callable);
//        System.out.println(future.get());
//        if(future.isDone()){
//            System.out.println("task is done");
//        }
//        execute.shutdown();

        ExecutorService execute= Executors.newSingleThreadExecutor();
        Future<Integer> future=  execute.submit(()-> 1+2);
        Thread.sleep(2000);
        Integer sum=future.get();
        System.out.println("sum is "+sum);
        execute.shutdown();
    }
}
