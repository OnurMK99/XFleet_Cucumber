package com.xfleet.step_definitions;

import com.xfleet.utilities.BrowserUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelRead {





    @Test
    public void read_excel() {
        System.out.println(BrowserUtils.truckDriversUserName());
        System.out.println(BrowserUtils.storeManagersUserName());
        System.out.println(BrowserUtils.salesManagersUserName());
    }
}





