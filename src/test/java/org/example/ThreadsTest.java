package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ThreadsTest {
    @Test
    @DisplayName("Multithreading")
    public void multiTest() throws InterruptedException {
        Thread runAnyways = new TestThread();
        runAnyways.start();
        System.out.println("Start stalled thread");
        Thread.sleep(3000);
        System.out.println("Finished stalled thread");

        // now we wait for it to finish for 3 seconds
        runAnyways = new TestThread();
        runAnyways.start();
        runAnyways.join(3000);
        System.out.println("Start stalled thread");
        Thread.sleep(3000);
        System.out.println("Finished stalled thread");

        /*
        this should print something like
        Start stalled thread
        Running now!
        Finished stalled thread
        Running now!
        Start stalled thread
        Finished stalled thread
         */
    }
}


class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running now!");
    }
}
