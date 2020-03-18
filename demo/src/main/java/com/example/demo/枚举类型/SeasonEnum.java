package com.example.demo.枚举类型;
//枚举
public enum  SeasonEnum {
    LOGIN(100,"用户登录"),LOGINOUT(200,"用户退出"),REMOVE(300,"用户不存在");
    private Integer code;
    private String msg;
    SeasonEnum(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    //两个方法本质上相同
    //按照状态码返回枚举对象
    public static SeasonEnum getEmpStatusByCode(Integer code){
        switch (code) {
            case 100:
                return LOGIN;
            case 200:
                return LOGINOUT;
            case 300:
                return REMOVE;
            default:
                return LOGINOUT;
        }
    }


    public static SeasonEnum getEmpEnum(int code) { //使用int类型  将每一个变量转化成一个对象
        for(SeasonEnum seasonEnum:  SeasonEnum.values()) {
            if(seasonEnum.getCode() == code)
                return seasonEnum;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(SeasonEnum.getEmpEnum(100));
        System.out.println(SeasonEnum.getEmpStatusByCode(200));
    }
}