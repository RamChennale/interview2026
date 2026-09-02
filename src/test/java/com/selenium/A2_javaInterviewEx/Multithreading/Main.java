package com.selenium.A2_javaInterviewEx.Multithreading;

// 1. Define the task logic
class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running via Runnable interface!");
    }
}

public class Main {
    public static void main(String[] args) {
        // 2. Instantiate the task
        MyTask task = new MyTask();

        // 3. Pass the task to a Thread constructor and start it
        Thread thread = new Thread(task);
        thread.start();
    }
}

