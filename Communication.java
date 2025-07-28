import java.util.concurrent.ExecutionException;

public class Communication {

    public Boolean FoodReady=false;

    public synchronized void cook(){
        System.out.println("Cook: The process started");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
        System.out.println("Cook: The Food is ready");
        notify();
    }

    public synchronized void server(){
        System.out.println("Server: Waiting for food to be ready");
        while(!FoodReady){
            try{
              wait();
            }catch (Exception e){}
            System.out.println("Server: Server served the food");
        }
    }

    public static void main(String[] args) {
        Communication communi= new Communication();

        Thread waiter= new Thread(()-> communi.server());
        Thread cooker = new Thread(()-> communi.cook());

        waiter.start();
        cooker.start();
    }
}
