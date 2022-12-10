package com.allis.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World! Welcome to Jenkins!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
