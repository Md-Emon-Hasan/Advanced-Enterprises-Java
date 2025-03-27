class myThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is thread 1 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class myThread2 implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("This is thread 2 " + i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        System.out.println("main function running:...");
        
        myThread1 ob1 = new myThread1();
        Thread ob2 = new Thread(new myThread2());
        
        ob1.start();
        ob2.start();
    }
}
