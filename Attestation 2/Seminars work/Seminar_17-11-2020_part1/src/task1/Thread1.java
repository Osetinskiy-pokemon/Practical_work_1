package task1;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState()+ " runnable");
        try {
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
