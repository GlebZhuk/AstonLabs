import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileUtils {
    public static void save(AppData data, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            StringBuilder headerLine = new StringBuilder();
            for (String headerValue : data.getHeader()) {
                headerLine.append(headerValue).append(";");
            }
            writer.write(headerLine.toString());
            writer.newLine();

            for (int[] row : data.getData()) {
                StringBuilder dataLine = new StringBuilder();
                for (int value : row) {
                    dataLine.append(value).append(";");
                }
                writer.write(dataLine.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(File file) {
        AppData data = new AppData();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String headerLine = reader.readLine();
            String[] headerValues = headerLine.split(";");

            String dataLine;
            int rowIndex = 0;
            while ((dataLine = reader.readLine()) != null) {
                String[] dataValues = dataLine.split(";");
                int[] row = new int [dataValues.length];
                for (int i =0; i < dataValues.length; i++) {
                    row[i] = Integer.parseInt(dataValues[i]);
                }
                data.getData()[rowIndex] = row;
                rowIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
