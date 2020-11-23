package Threads;
import static Threads.ThreadColor.ANSI_PURPLE;
import static java.lang.Thread.sleep;

public class New_thread2 implements Runnable {

    public void run(){
        try {
            sleep(500);
            System.out.println(ANSI_PURPLE+"I'm Thread 2.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
}
