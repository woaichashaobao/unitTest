package com.autohome.com.dealer.tuan.test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
/**
 * Created by wangwenchang on 2016/4/5.
 */
@RunWith(PowerMockRunner.class)
public class CommonClassTest extends TestCase {

    private CommonClass commonClass;

    @Before
    public void setUp() {
        commonClass = new CommonClass();
    }

    /**
     * 测试公有方法带参数
     * @throws Exception
     */
    public void testPublicMethodWithParam() throws Exception {
        String expectMessge = "public method with param : message of public method with param";
        String message = commonClass.publicMethodWithParam("message of public method with param");
        Assert.assertEquals(expectMessge, message);
    }

    /**
     * 测试公有方法不带参数
     * @throws Exception
     */
    public void testPublicMehtodWithOutParam() throws Exception {
        String expectMessge = "public method without param";
        String message = commonClass.publicMehtodWithOutParam();
        Assert.assertEquals(expectMessge, message);
    }

    /**
     * 测试私有方法带参数
     */
    public void testPrivateMethodWithParam(){
        String message = "message";
        String expectedMessage = "private method message";
        try {
            //利用powerMockito调用被测试类的私有方法，并验证返回值
            message = Whitebox.<String>invokeMethod(commonClass,"privateMethodWithParam",message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(expectedMessage,message);
    }

    /**
     * 测试私有方法不带参数
     *
     */
    public void testPrivateMethodWithOutParam(){
        String message = "";
        String expectedMessage = "private method message";
        try {
            //利用powerMockito调用被测试类的私有方法，并验证返回值
            message = Whitebox.<String>invokeMethod(commonClass,"privateMethodWithOutParam");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(expectedMessage,message);
    }
}