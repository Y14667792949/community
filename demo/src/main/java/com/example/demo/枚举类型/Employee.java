package com.example.demo.枚举类型;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

//实体类
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    //员工状态
    private SeasonEnum seasonEnum=SeasonEnum.LOGINOUT; //SeasonEnum类的引用
    private String empstsus;//改字段为员工状态码字段，与数据中的字段对应，查询出来后将100改为在线

    public Employee(){
    }
    public Employee(String lastName, String email, String gender) {
        super();
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public SeasonEnum getSeasonEnum() {
        return seasonEnum;
    }

    public void setSeasonEnum(SeasonEnum seasonEnum) {
        this.seasonEnum = seasonEnum;
    }

    public String getEmpstsus() {
        return empstsus;
    }

    public void setEmpstsus(String empstsus) {
        this.empstsus = empstsus;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", email="
                + email + ", gender=" + gender +", empstsus=" + empstsus+ "]";
    }


}
