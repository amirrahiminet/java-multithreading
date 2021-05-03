package sample2;

public class Main {

    public static void main(String[] args) {
        Thread1 th1=new Thread1();
        th1.setName("One");
        Thread1 th2=new Thread1();
        th2.setName("Two");

        th1.start();
        th2.start();

    }
}
