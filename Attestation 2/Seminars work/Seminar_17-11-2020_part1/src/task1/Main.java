package task1;
//Вывести состояние потока
//1) Перед запуском, 2) После запуска, 3) Во время выполнения
//С изпользованием synchronized, notifyAll, wait. Для синхронизации использовать простой объект класса Object
// 4) WAITING, 5) BLOCKED, 6) TIMED_WAITING
//МЕТОД - getState()
public class Main {
    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new Thread1());
            Thread thread2 = new Thread(new Thread2());
            System.out.println(thread.getState() + " new");
            thread.start();
            thread2.start();
            Thread.sleep(500);
            System.out.println(thread.getState() + " TIMED_WAITING");
            System.out.println(thread2.getState() + " WAITING");
            Thread.sleep(2000);
            System.out.println(thread.getState() + " terminated thread 1");
            System.out.println(thread2.getState() + " WAITING");
            Object obj = Thread2.getObj();
            synchronized (obj){
                obj.notify();
            }

            System.out.println(thread2.getState() + " BLOCKED");
            Thread.sleep(2000);
            System.out.println(thread2.getState() + " terminated thread 2");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
