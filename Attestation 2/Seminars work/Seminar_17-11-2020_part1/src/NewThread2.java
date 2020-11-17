public class NewThread2 implements Runnable{
    private boolean isActive;
    public void disable() {
        isActive = false;
    }

    @Override
    public void run() {
        System.out.printf("%s sterted\n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive) {
           System.out.println("Loop" + counter++);
           try {
               Thread.sleep(200);
           } catch (InterruptedException e) {
               System.out.println("Ошибка");
           }
       }
       System.out.printf("Поток %s завершен\n", Thread.currentThread().getName());
    }
}
