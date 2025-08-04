package multithreading;

public class Multiple5 implements Runnable{

    @Override
    public void run() {
        for (int i =1;i<=10;i++){
            System.out.println("5 * "+i+" =  "+ 5*i );
        }try{
            Thread.sleep(9000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
