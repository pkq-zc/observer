package com.buydeem;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        RadioStation station = new RadioStation();
        User zhanSan = new User("张三");
        User liSi = new User("李四");
        User wangWu = new User("王五");

        //订阅广播消息
        station.register(zhanSan);
        station.register(liSi);
        station.register(wangWu);

        //播放广播
        station.notifyObserver("今天是个好日子.");

        //李四取消订阅
        station.remove(liSi);

        //播放广播
        station.paly("明天全国放假");



    }
}
