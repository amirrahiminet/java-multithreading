package sample2;

public class Thread1 extends Thread {

    @Override
    public void run() {
        long counter=0;
        while (true)
        {
            System.out.println(this.getName() + " " + counter++);
            try{
                Thread.sleep(100);
            }catch (Exception e){}
        }
    }
}
