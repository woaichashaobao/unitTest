package com.autohome.com.dealer.tuan.test;

/**
 * Created by wangwenchang on 2016/4/5.
 */
public class CommonClass {

    /**
     * ���з���������
     * @param message
     * @return
     */
    public String publicMethodWithParam(String message){
        message = "public method with param : " + message;
        return message;
    }

    /**
     * ���з�����������
     * @return
     */
    public String publicMehtodWithOutParam(){
        String message = "public method without param";
        return message;
    }

    /**
     * ˽�з���������
     * @param message
     * @return
     */
    private String privateMethodWithParam(String message){
        message = "private method " + message;
        return message;
    }

    /**
     * ˽�з����޲���
     * @return
     */
    private String privateMethodWithOutParam(){
        String message = "private method message";
        return message;
    }

}
