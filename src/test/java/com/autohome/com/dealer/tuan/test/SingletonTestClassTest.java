package com.autohome.com.dealer.tuan.test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created by wangwenchang on 2016/4/5.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(SingletonTestClass.class)
public class SingletonTestClassTest extends TestCase {

    @Mock
    private SingletonTestClass singletonTestClass;

    /**
     * 测试单例的getInstance方法
     */
    @Test
    public void testGetInstance(){
        PowerMockito.mockStatic(SingletonTestClass.class);
        when(SingletonTestClass.getInstance()).thenReturn(singletonTestClass);
        when(singletonTestClass.getId()).thenReturn(1);
        when(singletonTestClass.getName()).thenReturn("name");

        Assert.assertTrue(SingletonTestClass.getInstance() != null);
        Assert.assertEquals(SingletonTestClass.getInstance().getId(), 1);
        Assert.assertEquals(SingletonTestClass.getInstance().getName(), "name");
    }

    /**
     * 测试调用私有构造器
     */
    @Test
    public void testInvokePrivateConstructor(){
        try {
            SingletonTestClass createdByPrivateConstructor = Whitebox.invokeConstructor(SingletonTestClass.class, 1, "name");

            Assert.assertEquals(createdByPrivateConstructor.getId(), 1);
            Assert.assertEquals(createdByPrivateConstructor.getName(), "name");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}