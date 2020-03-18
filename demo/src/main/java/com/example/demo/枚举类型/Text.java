package com.example.demo.枚举类型;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

public class Text {
//
//    //@Test
//    public <EmployeeMapper> void testEnumStaus()throws IOException {
//    //    SqlSessionFactory sqlSessionFactory= getSqlSessionFactory();
//      //  SqlSession openSession= sqlSessionFactory.openSession();
//
//        try{
//          //  EmployeeMapper mapper=openSession.getMapper(EmployeeMapper.class);
//            List<Employee> emplist=  mapper.getEmps();
//            Employee emp=new Employee();
//            //利用枚举类，对员工登录状态类型字段进行翻译
//            SeasonEnum seasonEnum=null;
//            for(int i=0;i<emplist.size();i++){
//                emp=emplist.get(i);
//                seasonEnum= seasonEnum.getEmpEnum(Integer.parseInt(emp.getEmpstsus()));//传入值，如100.200，，seasonEnum等同于LOGIN或者其他
//                //第一个seasonEnum是实体类中的 ，第二个是枚举对象
//                if(seasonEnum!=null) {
//                    emp.setEmpstsus(seasonEnum.getMsg());//数据库，查询emp对象后，根据员工状态字段调用getEmpEnum枚举类，方法，得到相应含义，再次赋值给emp对象的相应字段
//                    //seasonEnum是实体类中的引用，实体类的引用作用体现在这，用实体类中引用的值查找所对应的值
//                }//数据库中是状态码，只是给状态码复制为中文，并不改变数据库数据
//            }
//            //seasonEnum.getMsg()方法：获取该seasionEnum的Msg(中文)
//            for (Employee employee : emplist) {
//                System.out.println(employee);
//            }
//
//
//            /*openSession.commit();*/
//        }finally{
//           // openSession.close();
//        }
//    }
}
