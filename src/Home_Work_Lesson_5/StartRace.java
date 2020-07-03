public class StartRace implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
