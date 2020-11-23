package Threads;

import java.io.IOException;

import static Threads.ThreadColor.ANSI_GREEN;

public class New_thread3 extends Thread{
    @Override
    public void run() {
        try {
            sleep(2000);
            System.out.println(ANSI_GREEN+"Thread 3 has started");

        }
        catch (InterruptedException e)
        {
            e.getMessage();
        }
       }
}
