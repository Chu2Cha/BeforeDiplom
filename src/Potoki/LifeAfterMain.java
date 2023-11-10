package Potoki;

public class LifeAfterMain {
    public static void main(String[] args) throws InterruptedException {


        // метод Thread.currentThread()
        // возвращает текущий поток
        // в методе main() это поток main
        Thread mainThread = Thread.currentThread();

        Thread otherThread = new Thread(() -> {
            try {
                mainThread.join();

                /* ваш код, ожидающий завершения потока main */

                System.out.println("поток main завершился");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("конец otherThread");
        });

        otherThread.start();

        Thread.sleep(100L);
        System.out.println("конец main()");
    }
}
