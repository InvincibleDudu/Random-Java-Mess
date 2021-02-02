package test;

import bean.ExcelBean;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import util.PrintUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import static org.apache.poi.ss.usermodel.Row.MissingCellPolicy.CREATE_NULL_AS_BLANK;

/**
 * Created by InvincibleDudu on 10/21/2020 at 10:28
 */
public class TestExcel {
    public static final String FILE_NAME = "testExcel";

    public static void main(String[] args) throws IOException {
        FileInputStream s = new FileInputStream("C:\\Users\\InvincibleDudu\\Documents\\ECCOM\\" + FILE_NAME + ".xlsx");
        var wb = new XSSFWorkbook(s);
        var sheet = wb.getSheetAt(0);
        var list = new ArrayList<ExcelBean>();
        for (Row row : sheet) {
            var bean = new ExcelBean();
            bean.setId(row.getCell(0, CREATE_NULL_AS_BLANK).getStringCellValue());
            bean.setModule(row.getCell(1, CREATE_NULL_AS_BLANK).getStringCellValue());
            bean.setCaseName(row.getCell(2, CREATE_NULL_AS_BLANK).getStringCellValue());
            bean.setMethod(row.getCell(3, CREATE_NULL_AS_BLANK).getStringCellValue());
            bean.setUrl(row.getCell(4, CREATE_NULL_AS_BLANK).getStringCellValue());
            list.add(bean);
        }
            System.out.println(list);
    }
}
