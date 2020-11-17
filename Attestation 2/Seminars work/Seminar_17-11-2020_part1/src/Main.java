/*
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Thread t = Thread.currentThread();
        //System.out.println(t.getName());
        //t.setName("ASD");
        //System.out.println(t.getName());
        //System.out.println(t.getPriority()); //по умолчанию у всех приоритет 5
        //t.isAlive();
        //t.isInterrupted(); //тру - поток прерван
        //t.run(); //определяет точку входа в поток
        //t.sleep(12);
        //t.start();
        //Для создания потока надо либо наследоваться от Тред, либо имплементировать класс
        System.out.println("Main thread sterted...");
        //NewThread nt = new NewThread("Thread1");
        //nt.start();
        //try {
        //   Thread.sleep(200);
        //    nt.interrupt();
        //    Thread.sleep(10);
        //}catch (InterruptedException e){
        //    System.out.println("Прерван");
        //}
        CommonResurce commonResurce = new CommonResurce();
        for (int i = 1; i<5; i++){
            Thread t = new Thread(new CountThread(commonResurce), "Thread");
            t.start();
        }
        System.out.println("Закончен");
    }
}
 */
