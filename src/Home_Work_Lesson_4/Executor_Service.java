package Home_Work_Lesson_4;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Service {
    private static final Object mon = new Object();
    private static volatile char currentLetter = 'А';

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(printA());
        executorService.execute(printB());
        executorService.execute(printC());
        executorService.shutdown();

    }

    public static Runnable printA() {
        return() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (currentLetter != 'А') {
                            mon.wait();
                        }
                        System.out.println("А");
                        currentLetter = 'В';
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static Runnable printB() {
        return() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (currentLetter != 'В') {
                            mon.wait();
                        }
                        System.out.println("В");
                        currentLetter = 'С';
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static Runnable printC() {
        return () -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (currentLetter != 'С') {
                            mon.wait();
                        }
                        System.out.println("С");
                        currentLetter = 'А';
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
