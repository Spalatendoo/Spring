package com.lk.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();

        //代理，中介帮房东租房子，也会有一些附属操作
        Proxy proxy = new Proxy(host);
        //不用面对房东，直接找中介租房子
        proxy.rent();
        proxy.seeHouse();
        proxy.fare();
        proxy.hetong();
    }
}
