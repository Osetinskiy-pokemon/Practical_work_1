public class NewThread extends Thread{
    NewThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started\n", Thread.currentThread().getName());
        int counter = 1;
        while(!isInterrupted()){
            System.out.println("Loop"+counter++);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                interrupt();
            }
        }
        System.out.printf("Поток %s завершен\n", Thread.currentThread().getName());
    }
}
