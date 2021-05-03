package sample1;

public class Main {
    public static void main(String[] args) {
        ThreadSample th=new ThreadSample();
        th.start();

        RunnableSample rn=new RunnableSample();
        Thread thread=new Thread(rn);
        thread.start();
        System.out.println("okkkkkk!!!!");
    }
}
