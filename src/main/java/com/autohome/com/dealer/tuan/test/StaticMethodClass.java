package com.autohome.com.dealer.tuan.test;

/**
 * Created by wangwenchang on 2016/4/5.
 */
public final class StaticMethodClass {

    private StaticMethodClass(){
        //utiltive class should always have a private constructor
    }

    /**
     * 公有静态方法带参数
     * @param message
     * @return
     */
    public static String publicStaticMethodWithParam(String message){
        message = "public static method with param : " + message;
        return message;
    }

    /**
     * 公有静态方法不带参数
     * @return
     */
    public static String publicStaticMethodWithOutParam(){
        String message = "public static method without param : message";
        return message;
    }

    public static String publicStaticMethodCallsPrivateStaticMethod(){
        String message = "public static method ";
        privateStaticMethodWithParam(message);
        return message;
    }

    /**
     * 私有静态方法
     * @param message
     */
    private static void privateStaticMethodWithParam(String message){
        message = message + ", handled by private static method";
    }

}
