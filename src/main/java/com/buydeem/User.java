package com.buydeem;

/**
 * 张三
 * Created by zengchao on 2019/10/21.
 */
public class User implements Observer{
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public String getKey() {
        return userName;
    }

    @Override
    public void processMessage(String message) {
        System.out.println("["+userName + "]接收到:" + message);
    }
}
