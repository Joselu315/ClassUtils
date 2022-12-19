package com.github.joseluu.database.impl;

public interface IConnection {
    void start();
    void stop();
    void connect(String uri);
}
