package com.github.joseluu;

import com.github.joseluu.database.MongoConnection;
import com.github.joseluu.guice.GuiceModule;
import com.github.joseluu.guice.service.GuiceService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Utils dependency load with exits code by Joselu315");

        //Here you can an example code about how to work guice in main class
        Injector injector = Guice.createInjector(new GuiceModule());
        GuiceService guiceService = injector.getInstance(GuiceService.class);
        guiceService.start();
        guiceService.stop();
        //Here you can an example code about how to work guice in main class
        //Here you can do a simple connect with mongodb using uri
        new MongoConnection("uri", "testing");
        //Here you can do a simple connect with mongodb using uri
    }
}