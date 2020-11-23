package Threads;
import static Threads.ThreadColor.ANSI_PURPLE;

public class New_thread2 implements Runnable {

    public void run(){
        System.out.println(ANSI_PURPLE+"I'm Thread 2.");
    }
}
