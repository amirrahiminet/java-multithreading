package sample1;

public class RunnableSample implements Runnable {

    @Override
    public void run() {
        try {
            int i = 0;
            while (true) {
                i++;
                System.out.println("Runnalbe " + i);
                Thread.sleep(100);
            }
        }catch (Exception e){}
    }
}
