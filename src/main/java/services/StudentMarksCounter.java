package services;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class StudentMarksCounter {

    public void count() {
        // Specify the path to your Excel file
        String excelFilePath = "E:/phemily/Priya/2024/NEET/NEET 24 Jharkhand - centre wise/koderma/261501.xlsx";

        try {
            int ctr = 0;
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = WorkbookFactory.create(inputStream);

            // Get the first sheet of the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through all rows
            for (Row row : sheet) {
                // Iterate through all cells in the row
                for (Cell cell : row) {
                    // Check if the cell contains a numeric value
                    if (cell.getCellType() == CellType.NUMERIC) {
                        int numericValue = (int) cell.getNumericCellValue();
                        // Check if the numeric value is greater than 600
                        if (numericValue > 650) {
                            System.out.println(numericValue);
                            ctr++;
                        }
                    }
                }
            }
            System.out.println(ctr);

            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
