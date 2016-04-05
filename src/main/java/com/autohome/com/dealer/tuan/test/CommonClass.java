package com.autohome.com.dealer.tuan.test;

/**
 * Created by wangwenchang on 2016/4/5.
 */
public class CommonClass {

    /**
     * 公有方法带参数
     * @param message
     * @return
     */
    public String publicMethodWithParam(String message){
        message = "public method with param : " + message;
        return message;
    }

    /**
     * 公有方法不带参数
     * @return
     */
    public String publicMehtodWithOutParam(){
        String message = "public method without param";
        return message;
    }

    /**
     * 私有方法带参数
     * @param message
     * @return
     */
    private String privateMethodWithParam(String message){
        message = "private method " + message;
        return message;
    }

    /**
     * 私有方法无参数
     * @return
     */
    private String privateMethodWithOutParam(){
        String message = "private method message";
        return message;
    }

}
