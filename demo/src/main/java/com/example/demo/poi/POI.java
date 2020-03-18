package com.example.demo.poi;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class POI {
        public List<Area> importXLS(){
            ArrayList<Area> list = new ArrayList<>();
            try {
            //1、获取文件输入流
            InputStream inputStream = new FileInputStream("D:\\dudu\\quanguozhaopin.xls");
            //2、获取Excel工作簿对象
                HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
                //3、得到Excel工作表对象
                HSSFSheet sheetAt = workbook.getSheetAt(0);
                //4、循环读取表格数据
            for (Row row : sheetAt) {
                //读取当前行中单元格数据，索引从0开始
                String position = row.getCell(0).getStringCellValue();
                String company = row.getCell(1).getStringCellValue();
                String workplace =row .getCell(2).getStringCellValue();
                String salary = row.getCell(3).getStringCellValue();
                String pubdate = row.getCell(4).getStringCellValue();
                String id = row.getCell(5).getStringCellValue();
                Area area = new Area();
                area.setPosition(position);
                area.setCompany(company);
                area.setWorkplace(workplace);
                area.setSalary(salary);
                area.setPubdate(pubdate);
                area.setId(id);
                list.add(area);
                }

                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        return list;
        }
    }
