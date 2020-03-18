package com.example.demo.staticFactory;

//静态多工厂
public class SendFactory {
    //工厂1
    public static Sender produceMail() {
        return new MailSender();
    }
    //工厂2
    public static Sender produceSms(){
        return new SmsSender();
    }
}
