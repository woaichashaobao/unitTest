package com.autohome.com.dealer.tuan.test;

/**
 * µ•¿˝≤‚ ‘¿‡
 * Created by wangwenchang on 2016/4/5.
 */
public class SingletonTestClass {

    private final int id;

    private final String name;

    private static SingletonTestClass instance;

    private SingletonTestClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SingletonTestClass getInstance() {
        if (instance == null) {
            instance = new SingletonTestClass(1, "UtilClassName");
        }
        return instance;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

