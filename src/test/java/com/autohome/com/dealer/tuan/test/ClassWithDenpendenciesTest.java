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
        //mock����������������������������ʼ������
        Whitebox.setInternalState(classWithDenpendencies,"denpendency1",denpendency1);
        Whitebox.setInternalState(classWithDenpendencies,"denpendency2",denpendency2);
    }


    /**
     * �����޸�����1���ص���Ϣ
     * @throws Exception
     */
    public void testDenpendency1PrintMessage() throws Exception {
        //����mock�Ķ���ĳ������������ʱ��ָ������ֵ
        when(denpendency1.returnMessage()).thenReturn("denpendency1 return message");
        String expectedMessge = "modify the message which is returned by denpendency1,denpendency1 return message";
        String message = classWithDenpendencies.modifyDenpendency1ReturnMessage();
        //��֤�����ķ����Ƿ񱻵��ú͵��ô���
        verify(denpendency1,times(1)).returnMessage();
        verify(denpendency2,never()).returnMessage();
        Assert.assertEquals(expectedMessge,message);
    }

    /**
     *�����޸�����2���ص���Ϣ
     * @throws Exception
     */
    public void testDenpendency2PrintMessage() throws Exception {
        //����mock�Ķ���ĳ������������ʱ��ָ������ֵ
        when(denpendency2.returnMessage()).thenReturn("denpendency2 return message");
        String expectedMessge = "modify the message which is returned by denpendency2,denpendency2 return message";
        String message = classWithDenpendencies.modifyDenpendency2ReturnMessage();
        //��֤�����ķ����Ƿ񱻵��ú͵��ô���
        verify(denpendency2,times(1)).returnMessage();
        verify(denpendency1,never()).returnMessage();
        Assert.assertEquals(expectedMessge, message);
    }

}