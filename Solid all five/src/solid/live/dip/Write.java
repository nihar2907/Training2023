package solid.live.dip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write implements writeData{
    @Override
    public void writeDataInFile(String filePath, String inputData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(inputData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeDataInDatabase(String inputData) {
        MyDatabase.write(inputData);
    }
}