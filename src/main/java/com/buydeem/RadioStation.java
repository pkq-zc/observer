package com.buydeem;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * 广播电台
 * Created by zengchao on 2019/10/21.
 */
public class RadioStation implements Observerable{
    private List<Observer> observers;

    public RadioStation() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.removeIf(item -> Objects.equals(observer.getKey(),item.getKey()));
    }

    @Override
    public void notifyObserver(String message) {
        observers.forEach(item -> item.processMessage(message));
    }

    /**
     * 广播消息
     * @param message 消息内容
     */
    public void paly(String message){
        notifyObserver(message);
    }
}
