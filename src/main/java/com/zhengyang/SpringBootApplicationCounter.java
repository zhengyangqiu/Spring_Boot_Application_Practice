package com.zhengyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApplicationCounter {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationCounter.class, args);
    }

    static int count =0;
    @GetMapping(path = "current-count")
    int getCurrentCount(){
        return count;
    }
    @GetMapping(path = "increment-count")
    int getIncrementCount(){
        count++;
        return count;
    }
    @GetMapping(path = "decrement-count")
    int getDecrementCount(){
        count--;
        return count;
    }


    // All your code should be inside this one class
    // add @RestController to you expose methods as REST services to clients
    // create a variable static int count = 0;

    // All methods should have a @GetMapping
    // Create a method to get current count. i.e localhost:8080/current-count
    // Create method to increment the count. i.e localhost:8080/increment-count
    // Create method to decrement the count. i.e localhost:8080/decrement-count
    // Test your api with chrome
}
