package sample4;

public class PriorityThread extends Thread {
    @Override
    public void run() {
        long i=0;
        while (i<10){
            System.out.println(this.getName() +  i++);
            try {
                if (this.getName().equals("Two") && i==5)
                    this.join(5000);

                Thread.sleep(10);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
