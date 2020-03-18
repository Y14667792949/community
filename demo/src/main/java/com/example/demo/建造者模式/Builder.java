package com.example.demo.建造者模式;

/**
 * 建造者  规定建造的顺序
 */
abstract class Builder {
    //汉堡
    abstract Builder bulidA(String mes);
    //饮料
    abstract Builder bulidB(String mes);
    //薯条
    abstract Builder bulidC(String mes);
    //甜品
    abstract Builder bulidD(String mes);
    //获取套餐
    abstract Product build();
}
