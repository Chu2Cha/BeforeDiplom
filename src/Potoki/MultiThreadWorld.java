package Potoki;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadWorld {
    private static final int N = 10;

    public static void main(String[] args) {
        Runnable helloWorldRunnable = () -> System.out.println("Hello, world!");

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Thread thread = new Thread(helloWorldRunnable);
            threads.add(thread);
        }

        // 1. создать N потоков
        // 2. добавить их в threads

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
