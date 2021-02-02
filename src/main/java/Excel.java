import bean.ExcelBean;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static org.apache.poi.ss.usermodel.Row.MissingCellPolicy.CREATE_NULL_AS_BLANK;

/**
 * Created by InvincibleDudu on 10/15/2020 at 14:22
 */
public class Excel {
    public static final String PREFIX = "https://192.168.244.144:443/admin";
    //    public static final String FILE_NAME = "终端认证";
    public static final String[] FILE_NAME_ARRAY = {"字典", "查询单个组织", "查询组织架构", "会议模板",
            "单个会议室查询", "会议室查询", "单个用户查询", "用户查询", "单个会议账号查询", "会议账号查询", "获取单个会议",
            "获取会议信息", "结束会议", "修改会议", "预约会议", "刷新终端认证", "终端认证", "刷新鉴权", "用户认证"};
//    public static String FILE_NAME = FILE_NAME_ARRAY[2];

    public static void main(String[] args) throws IOException {
        for (String FILE_NAME : FILE_NAME_ARRAY) {
//        var FILE_NAME = FILE_NAME_ARRAY[2];
            FileInputStream s = new FileInputStream("C:\\Users\\InvincibleDudu\\Documents\\ECCOM\\" + FILE_NAME + ".xls");
            Workbook wb = new HSSFWorkbook(s);
            Sheet sheet = wb.getSheetAt(0);
//            Map<Integer, List<String>> data = new HashMap<>();
            List<ExcelBean> list = new ArrayList<>();
//            int i = 0;
            for (Row row : sheet) {
                if (row.getCell(0).getStringCellValue().equals("ID"))
                    continue;
                var bean = new ExcelBean();
//                data.put(i, new ArrayList<>());
//                for (Cell cell : row) {
//                    if (cell.getCellType() == CellType.STRING) {//                        System.out.println("string: " + cell.getRichStringCellValue().getString());
//                        data.get(i).add(cell.getRichStringCellValue().getString());
//                    } else {
//                        System.out.println("its default");
//                        data.get(i).add(" ");
//                    }
//                }
                bean.setId(row.getCell(0).getStringCellValue());
                bean.setCaseName(row.getCell(1).getStringCellValue());
                bean.setModule(row.getCell(5).getStringCellValue());
                bean.setData(row.getCell(6, CREATE_NULL_AS_BLANK).getStringCellValue());
                bean.setExpectation(row.getCell(8, CREATE_NULL_AS_BLANK).getStringCellValue());
                bean.setUrl(getInterfaceAddress(row.getCell(7).getStringCellValue()));
                bean.setMethod(getRequestMethod(row.getCell(7).getStringCellValue()));
//                i++;
                list.add(bean);
            }
//        System.out.println(data);
//            for (int j = 0; j < data.size(); j++) {
//                var l = data.get(j);
//        System.out.println(l.get(6));
//        System.out.println(replaceInterfaceAddress(l.get(6)));
//                for (String str : l) {
//                    try {
//                        ExcelBean eb = new ExcelBean();
//                        if (getInterfaceAddress(str) != null)
//                            eb.setUrl(getInterfaceAddress(str));
//                        if (getRequestMethod((str)) != null) {
//                            eb.setId(l.get(0));
//                            eb.setCaseName(l.get(1));
//                            eb.setModule(l.get(5));
//                            eb.setData(l.get(6));
//                            eb.setExpectation(l.get(8));
//                            eb.setMethod(getRequestMethod(str));
//                            list.add(eb);
//                        }
//                    } catch (IndexOutOfBoundsException e) {
//                        System.out.println(FILE_NAME + e);
//                    }
//                }
//            }
//        System.out.println(FILE_NAME + " size: " + list.size());
//        System.out.println(list);
            writeExcel(list, FILE_NAME);
        }
    }

    public static String getInterfaceAddress(String s) {
        var p = Pattern.compile("[：]/.+");
        var m = p.matcher(s);
        if (m.find())
            return PREFIX + m.group().replaceAll("：", "").trim();
        p = Pattern.compile("地址：.+");
        m = p.matcher(s);
        if (m.find())
            return PREFIX + "/" + m.group().replaceAll("地址：", "").trim();
        return null;
    }

    public static String getRequestMethod(String s) {
        var p = Pattern.compile("类型：.+");
        var m = p.matcher(s);
        if (m.find())
            return m.group().replaceAll("类型：", "").trim();
        return null;
    }

    static void writeExcel(List<ExcelBean> list, String FILE_NAME) throws IOException {
        if (list.size() == 0)
            return;
        var workbook = new XSSFWorkbook();
        var sheet = workbook.createSheet("list");
//        var sheet = workbook.getSheet("Persons");
//        sheet.setColumnWidth(0, 6000);
//        sheet.setColumnWidth(1, 4000);
//        Row header = sheet.createRow(0);
//        CellStyle headerStyle = workbook.createCellStyle();
//        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
//        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//        XSSFFont font = workbook.createFont();
//        font.setFontName("Arial");
//        font.setFontHeightInPoints((short) 16);
//        font.setBold(true);
//        headerStyle.setFont(font);
//        Cell headerCell = header.createCell(0);
//        headerCell.setCellValue("Name");
//        headerCell.setCellStyle(headerStyle);
//        headerCell = header.createCell(1);
//        headerCell.setCellValue("Age");
//        headerCell.setCellStyle(headerStyle);
//        CellStyle style = workbook.createCellStyle();
//        style.setWrapText(true);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("John Smith");
//        cell.setCellStyle(style);
//        cell = row.createCell(1);
//        cell.setCellValue(20);
//        cell.setCellStyle(style);
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("ID");
        row.createCell(1).setCellValue("module");
        row.createCell(2).setCellValue("case_name");
        row.createCell(3).setCellValue("method");
        row.createCell(4).setCellValue("url");
        row.createCell(5).setCellValue("headers");
        row.createCell(6).setCellValue("params");
        row.createCell(7).setCellValue("data");
        row.createCell(8).setCellValue("sql");
        row.createCell(9).setCellValue("expectation");
        row.createCell(10).setCellValue("return_result");
        row.createCell(11).setCellValue("result");
        for (int i = 0; i < list.size(); i++) {
            ExcelBean bean = list.get(i);
            row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(bean.getId());
            row.createCell(1).setCellValue(bean.getModule());
            row.createCell(2).setCellValue(bean.getCaseName());
            row.createCell(3).setCellValue(bean.getMethod());
            row.createCell(4).setCellValue(bean.getUrl());
            row.createCell(7).setCellValue(bean.getData());
            row.createCell(9).setCellValue(bean.getExpectation());
        }
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        String fileLocation = path.substring(0, path.length() - 1) + FILE_NAME + ".xlsx";
        FileOutputStream outputStream = new FileOutputStream(fileLocation);
        workbook.write(outputStream);
        workbook.close();
    }
}
