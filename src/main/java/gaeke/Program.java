package gaeke;

public class Program {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("lambda expression implementing the run method");
        new Thread(r).start();
    }
}
