package DeadLock;

public class Deadlok {

    public static final Object pen = new Object();// u can also use REentrantLock also
    public static final Object paper = new Object();

    static class Persion1 extends Thread{
       public void run(){
           synchronized (pen){
               System.out.println(Thread.currentThread().getName()+ " is accessing the pen");
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               synchronized (paper){
                   System.out.println(Thread.currentThread().getName()+" also accessed the paper");
               }
           }
       }
    }

    static class Person2 extends Thread{
        public void run(){
            synchronized (paper){
                System.out.println(Thread.currentThread().getName()+" is accessing te paper ");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){
                    throw new RuntimeException();
                }
                synchronized (pen){
                    System.out.println(Thread.currentThread().getName()+" is accessd the pen");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Persion1().start();
        Person2 t1= new Person2();
        t1.setName("Vighnesh");
        t1.start();
    }
}
