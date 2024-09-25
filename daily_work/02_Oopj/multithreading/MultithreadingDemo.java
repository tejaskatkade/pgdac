class MyThread extends Thread {

    MyThread() {

    }

    MyThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        //System.out.println("Thread is running "+this.getName());
        System.out.println(currentThread().getName() + " sarted");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // In run method we can not throw exception as it is overriden
        
        System.out.println(currentThread().getName() + " Ended");
        
    }

}

public class MultithreadingDemo{

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread("First");
        myThread1.start();
        Thread.sleep(500);
        MyThread myThread2 = new MyThread("Second");
        myThread2.start();
        //System.out.println(myThread1.getName());
        //System.out.println(myThread2.getName());
    
        // Order of execution of thread can not be fix
    
    }
}