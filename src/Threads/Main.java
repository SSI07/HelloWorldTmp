package Threads;

import static Threads.ThreadColor.ANSI_CYAN;
import static Threads.ThreadColor.ANSI_RED;

public class Main{
    public static void main(String[] args) {
        System.out.println(ANSI_RED+"Thread 1 started");
        New_thread2 t1=new New_thread2();
        Thread t2=new Thread(t1);
        t2.start();
        New_thread3 t3=new New_thread3();
        t3.start();
        new Thread(){
            public void run(){
                try {
                    t3.join();
                    System.out.println(ANSI_CYAN +"IM thread 4");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}

