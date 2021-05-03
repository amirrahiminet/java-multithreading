package sample1;

public class ThreadSample extends Thread{

    @Override
    public void run() {
        try {
            int i = 0;
            while (true) {
                i++;
                System.out.println("Thread " + i);
                Thread.sleep(100);
            }
        }catch (Exception e){}
    }
}
