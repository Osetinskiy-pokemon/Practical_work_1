package Task2;

public class Main {
    public static void main(String[] strings) {
        Object lock = new Object();
        new SyncThread(lock).start();
        new SyncThread(lock).start();
    }
}