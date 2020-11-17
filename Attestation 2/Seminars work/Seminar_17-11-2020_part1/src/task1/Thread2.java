package task1;

public class Thread2 implements Runnable {
    public static Object getObj() {
        return obj;
    }

    private static Object obj = new Object();
    @Override
    public void run() {
        try {
            synchronized (obj) {
                obj.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
