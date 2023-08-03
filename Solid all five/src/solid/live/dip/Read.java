package solid.live.dip;

import java.io.*;
import java.net.URL;

public class Read implements readData{
    @Override
    public String readDataFromFile(String filePath) throws IOException {
        StringBuilder inputData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((reader.readLine()) != null) {
                inputData.append(reader.readLine());
            }
        }

        return inputData.toString();
    }

    @Override
    public String readDataFromUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();

        try {
            int c;
            while ((c = reader.read()) != -1) {
                inputString.append((char) c);
            }
        } finally {
            reader.close();
        }

        return inputString.toString();
    }
}
