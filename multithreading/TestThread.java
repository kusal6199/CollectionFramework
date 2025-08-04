package multithreading;

public class TestThread extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Multiple5());
        Thread t2 = new Thread(new Multiple7());

        t1.start();
        t2.start();
    }
}
