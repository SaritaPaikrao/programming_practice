package org.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(5);
        executor.execute(() -> {
         System.out.println("Task executed by thread: " + Thread.currentThread().getName());
        });


        ExecutorService executor1 = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor1.submit(() -> {
                System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
            });
        }

        executor1.shutdown();
    }




}

