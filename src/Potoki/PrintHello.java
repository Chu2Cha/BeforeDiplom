package Potoki;

public class PrintHello {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("Hello, world!"));
        thread.start();
    }
}
