package Composition;

class Enginee{
    public void start(){
        System.out.println("Engine started");
    }

    public void Stop(){
        System.out.println("Enginee end");
    }
}

public class Car {
    Enginee n= new Enginee();

    void run(){
        n.start();
        n.Stop();
    }

    public static void main(String[] args) {
        Car n= new Car();
        n.run();

    }
}
