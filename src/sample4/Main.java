package sample4;

public class Main {
    public static void main(String[] args) {
        PriorityThread pt1=new PriorityThread();
        PriorityThread pt2=new PriorityThread();
        pt1.setPriority(Thread.MIN_PRIORITY);
        pt2.setPriority(Thread.MAX_PRIORITY);

        pt1.setName("One");
        pt2.setName("Two");
        pt1.start();
        pt2.start();

    }
}
