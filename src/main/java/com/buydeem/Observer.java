package com.buydeem;

/**
 * 观察者接口
 * Created by zengchao on 2019/10/21.
 */
public interface Observer {
    /**
     * 获取区分唯一观察者的key
     * @return
     */
    String getKey();

    /**
     * 处理收到的消息
     * @param message
     */
    void processMessage(String message);
}
