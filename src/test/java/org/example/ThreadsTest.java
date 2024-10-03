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
    }
}


class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running now!");
    }
}
