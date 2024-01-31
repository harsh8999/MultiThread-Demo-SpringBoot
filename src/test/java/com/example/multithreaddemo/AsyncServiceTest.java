package com.example.multithreaddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AsyncServiceTest {
    
    @Autowired
    private AsyncService asyncService;

    @Test
    void testAsync() throws InterruptedException, ExecutionException {
        CompletableFuture<String> future = asyncService.process("Some Data");

        String result = future.get();

        assertEquals("Processed data Some Data", result);
    }
}
