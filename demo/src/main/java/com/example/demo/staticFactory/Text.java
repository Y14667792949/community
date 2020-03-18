package com.example.demo.staticFactory;

public class Text {
    public static void main(String[] args) {
        //静态工厂不需要实例化SendFactory
        Sender sender = SendFactory.produceMail();
        sender.sender();
    }
}
