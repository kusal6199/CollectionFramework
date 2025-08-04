package multithreading;

public class Multiple7 implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10; i++){
            System.out.println("7 * "+i+" = "+i*7);
        }
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
