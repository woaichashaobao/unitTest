package com.autohome.com.dealer.tuan.test;

import com.autohome.com.dealer.tuan.test.denpendencies.Denpendency1;
import com.autohome.com.dealer.tuan.test.denpendencies.Denpendency2;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.powermock.api.mockito.PowerMockito.when;
import static org.mockito.Mockito.*;
/**
 * Created by wangwenchang on 2016/4/5.
 */
@RunWith(PowerMockRunner.class)
public class ClassWithDenpendenciesTest extends TestCase {
    @Mock
    private Denpendency1 denpendency1;

    @Mock
    private Denpendency2 denpendency2;

    private ClassWithDenpendencies classWithDenpendencies;

    @Before
    public void setUp(){
        classWithDenpendencies = new ClassWithDenpendencies();
        //mock被测试类依赖的两个变量，并初始化它们
        Whitebox.setInternalState(classWithDenpendencies,"denpendency1",denpendency1);
        Whitebox.setInternalState(classWithDenpendencies,"denpendency2",denpendency2);
    }


    /**
     * 测试修改依赖1返回的消息
     * @throws Exception
     */
    public void testDenpendency1PrintMessage() throws Exception {
        //当被mock的对象某个方法被调用时，指定返回值
        when(denpendency1.returnMessage()).thenReturn("denpendency1 return message");
        String expectedMessge = "modify the message which is returned by denpendency1,denpendency1 return message";
        String message = classWithDenpendencies.modifyDenpendency1ReturnMessage();
        //验证变量的方法是否被调用和调用次数
        verify(denpendency1,times(1)).returnMessage();
        verify(denpendency2,never()).returnMessage();
        Assert.assertEquals(expectedMessge,message);
    }

    /**
     *测试修改依赖2返回的消息
     * @throws Exception
     */
    public void testDenpendency2PrintMessage() throws Exception {
        //当被mock的对象某个方法被调用时，指定返回值
        when(denpendency2.returnMessage()).thenReturn("denpendency2 return message");
        String expectedMessge = "modify the message which is returned by denpendency2,denpendency2 return message";
        String message = classWithDenpendencies.modifyDenpendency2ReturnMessage();
        //验证变量的方法是否被调用和调用次数
        verify(denpendency2,times(1)).returnMessage();
        verify(denpendency1,never()).returnMessage();
        Assert.assertEquals(expectedMessge, message);
    }

}