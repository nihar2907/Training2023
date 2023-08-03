package solid.live.dip;

import java.io.IOException;

public interface readData {
    String readDataFromFile(String filePath) throws IOException;
    String readDataFromUrl(String urlString) throws IOException;
}
