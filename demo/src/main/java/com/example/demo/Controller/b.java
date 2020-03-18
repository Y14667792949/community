package com.example.demo.Controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class b {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("tom","aaa");
        map.put("aop","bbb");
        map.put("dob","ccc");

        Set<Map.Entry<String,String>> entries =map.entrySet();
        for(Map.Entry<String,String> entry: entries){
            System.out.println(entry.getKey());
//
//
//            //BufferedInputStream br=new BufferedInputStream(new InputStreamReader());
//            ApplicationContext context = new ClassPathXmlApplicationContext();
//            FileSystemXmlApplicationContext
//                    ListableBeanFactory listableBeanFactory =new
//                            BeanDefinition
        }
    }
}
