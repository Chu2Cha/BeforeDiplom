package Potoki;

public class PrintCount {
    private static final int PRINT_COUNT = 1_000_000;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < PRINT_COUNT; i++) {
                System.out.print("o");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < PRINT_COUNT; i++) {
                System.out.print("X");
            }
        });

        thread1.start();
        thread2.start();
    }
}
