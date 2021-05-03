package sample3;

public class Main {
    public static void main(String[] args) {
        JoinThread jt1=new JoinThread();
        JoinThread jt2=new JoinThread();
        JoinThread jt3=new JoinThread();

        // join method waits for a thread to die
        jt1.start();
        try {
            jt1.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        jt2.start();
        jt3.start();
    }
}
