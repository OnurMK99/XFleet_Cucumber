package com.xfleet.utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {


   // static sleep method accept seconds and wait during time
   //@param seconds
    public static void sleep(int seconds) {

        int wait =seconds*1000;
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            System.out.println("static sleep issue");
        }
    }

    public static List<String> truckDriversUserName(){

        String path = "credentials.xlsx";

        List<String> truckDrivers = new ArrayList<>();



        try{
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();

            for (int i = 1; i < rowNumber; i++) {

                truckDrivers.add(sheet.getRow(i).getCell(0).toString());
            }



        } catch (Exception e){

            e.printStackTrace();
        }

        return truckDrivers;
    }

    public static List<String> storeManagersUserName(){

        String path = "credentials.xlsx";


        List<String> storeManagers = new ArrayList<>();



        try{
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();

            for (int i = 1; i < rowNumber; i++) {

                storeManagers.add(sheet.getRow(i).getCell(1).toString());
            }


        } catch (Exception e){

            e.printStackTrace();
        }
        return storeManagers;
    }

    public static List<String> salesManagersUserName(){

        String path = "credentials.xlsx";


        List<String> salesManagers = new ArrayList<>();


        try{
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();



            for (int i = 1; i < rowNumber; i++) {

                salesManagers.add(sheet.getRow(i).getCell(2).toString());
            }



        } catch (Exception e){

            e.printStackTrace();
        }

        return salesManagers;
    }
    }



