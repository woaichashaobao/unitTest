package com.autohome.com.dealer.tuan.test;

/**
 * Created by wangwenchang on 2016/4/5.
 */
public final class StaticMethodClass {

    private StaticMethodClass(){
        //utiltive class should always have a private constructor
    }

    /**
     * ���о�̬����������
     * @param message
     * @return
     */
    public static String publicStaticMethodWithParam(String message){
        message = "public static method with param : " + message;
        return message;
    }

    /**
     * ���о�̬������������
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
     * ˽�о�̬����
     * @param message
     */
    private static void privateStaticMethodWithParam(String message){
        message = message + ", handled by private static method";
    }

}
