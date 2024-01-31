package com.example.multithreaddemo;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    
    @Async
    public CompletableFuture<String> process(String name) {
        // make wait
        try {
            Thread.sleep(10000);
        } catch (InterruptedException exception) {      
            Thread.currentThread().interrupt();
        }

        return CompletableFuture.completedFuture("Processed data " + name); 
    }
}
