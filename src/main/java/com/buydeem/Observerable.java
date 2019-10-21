package com.buydeem;

/**
 * 被观察者接口
 * Created by zengchao on 2019/10/21.
 */
public interface Observerable {
    /**
     * 注册观察者
     * @param observer
     */
    void register(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void remove(Observer observer);

    /**
     * 通知观察者
     * @param message
     */
    void notifyObserver(String message);
}
