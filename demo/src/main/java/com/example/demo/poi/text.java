package com.example.demo.poi;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class text {
    public static void main(String[] args) throws IOException {
        String targetPath = "D:\\dudu\\";
        FileOutputStream fos = null;

        POI poi=new POI();
        //获取数据
        List list=poi.importXLS();
        List<String> list1 = new ArrayList<>();
        list1.add("北京");
        list1.add("北京-海淀区");
        list1.add("北京-大兴区");
        list1.add("北京-朝阳区");
        list1.add("北京-丰台区");
        list1.add("北京-西城区");
        //创建标题行

        for (String fenqu : list1) {
            //1.在内存中创建一个excel文件
            HSSFWorkbook Workbook = new HSSFWorkbook();
            //2.创建工作簿
            HSSFSheet sheet = Workbook.createSheet(fenqu);
            HSSFRow titlerRow = sheet.createRow(0);
            titlerRow.createCell(0).setCellValue("职位");
            titlerRow.createCell(1).setCellValue("公司");
            titlerRow.createCell(2).setCellValue("城市");
            titlerRow.createCell(3).setCellValue("薪水");
            titlerRow.createCell(4).setCellValue("时间");
            titlerRow.createCell(5).setCellValue("Id");

            for (int i = 0; i < list.size(); i++) {
                Area area = (Area) list.get(i);
                if (area.getWorkplace().equals(fenqu)) {
                    int lastRowNum = sheet.getLastRowNum();//获取最后一行数据行数
                    HSSFRow dataRow = sheet.createRow(lastRowNum + 1);//创建行数（加上表头）
                    dataRow.createCell(0).setCellValue(area.getPosition());
                    dataRow.createCell(1).setCellValue(area.getCompany());
                    dataRow.createCell(2).setCellValue(area.getWorkplace());
                    dataRow.createCell(3).setCellValue(area.getSalary());
                    dataRow.createCell(4).setCellValue(area.getPubdate());
                    dataRow.createCell(5).setCellValue(area.getId());

                }
                fos = new FileOutputStream(targetPath + fenqu + ".txt");
                Workbook.write(fos);
            }
            System.out.println(targetPath + fenqu + ".xls" + "写入成功");
        }
    }
}
