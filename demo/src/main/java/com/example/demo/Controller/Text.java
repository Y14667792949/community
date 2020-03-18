package com.example.demo.Controller;

public class Text {
    public static void main(String[] args) {
       Provider provider=new SendSmsFactory();
       Sender sender=provider.produce();
        sender.sender();
    }
}
