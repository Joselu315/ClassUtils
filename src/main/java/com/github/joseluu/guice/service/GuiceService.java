package com.github.joseluu.guice.service;

import com.github.joseluu.guice.service.impl.IService;

public class GuiceService implements IService {
    @Override
    public void start() {
        System.out.println("Guice service is running now!");
        //here you need write a code of service you want run
    }

    @Override
    public void stop() {
        System.out.println("Guice service is stopping now!");
    }
}
