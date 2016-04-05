package com.autohome.com.dealer.tuan.test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created by wangwenchang on 2016/4/5.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticMethodClass.class)
public class StaticMethodClassTest extends TestCase {

    @Test
    public void testPublicStaticMethodWithParam() throws Exception {
        PowerMockito.mockStatic(StaticMethodClass.class);
        when(StaticMethodClass.publicStaticMethodWithParam(any(String.class))).thenReturn("static method with param");
        String expectedMessage = "static method with param";
        Assert.assertEquals(expectedMessage, StaticMethodClass.publicStaticMethodWithParam("message"));
    }

    @Test
    public void testPublicStaticMethodWithOutParam() throws Exception {
        PowerMockito.mockStatic(StaticMethodClass.class);
        when(StaticMethodClass.publicStaticMethodWithOutParam()).thenReturn("static method without param");
        String expectedMessage = "static method without param";
        String message = StaticMethodClass.publicStaticMethodWithOutParam();
        Assert.assertEquals(expectedMessage, message);
    }

    @Test
    public void testPublicStaticMethodCallsPrivateStaticMethod() throws Exception {
        PowerMockito.mockStatic(StaticMethodClass.class);
        when(StaticMethodClass.publicStaticMethodCallsPrivateStaticMethod()).thenReturn("static method calls privte static method");
        String expectedMessage = "static method calls privte static method";
        String message = StaticMethodClass.publicStaticMethodCallsPrivateStaticMethod();
        Assert.assertEquals(expectedMessage,message);
    }
}