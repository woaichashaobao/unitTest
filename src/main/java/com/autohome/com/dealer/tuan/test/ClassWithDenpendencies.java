package com.autohome.com.dealer.tuan.test;

import com.autohome.com.dealer.tuan.test.denpendencies.Denpendency1;
import com.autohome.com.dealer.tuan.test.denpendencies.Denpendency2;

/**
 * Created by wangwenchang on 2016/4/5.
 */
public class ClassWithDenpendencies {

    private Denpendency1 denpendency1;

    private Denpendency2 denpendency2;

    /**
     * 依赖类修改消息
     * @return
     */
    public String modifyDenpendency1ReturnMessage(){
        String message = denpendency1.returnMessage();
        message = "modify the message which is returned by denpendency1," + message;
        return message;
    }

    /**
     * 依赖类修改消息
     * @return
     */
    public String modifyDenpendency2ReturnMessage(){
        String message = denpendency2.returnMessage();
        message = "modify the message which is returned by denpendency2," + message;
        return message;
    }

    public String returnMessage(int type){
        if(type == 1){
            return modifyDenpendency1ReturnMessage();
        }else if(type == 2) {
            return modifyDenpendency2ReturnMessage();
        }
        return "";
    }
}
