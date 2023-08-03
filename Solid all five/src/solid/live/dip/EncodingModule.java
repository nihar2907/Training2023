package solid.live.dip;


import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */


public class EncodingModule{

    Read read = new Read();
    Write write = new Write();
    Encode encode = new Encode();


    public void encodeWithFiles() {
        String path = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip";
        try {
            String fileData = read.readDataFromFile(path +"/beforeEncryption.txt");
            String encryptedData = encode.encodedData(fileData);
            write.writeDataInFile(path + "/afterEncryption.txt" , encryptedData);
        }catch (Throwable e) {
            System.out.println(e);
        }
    }

    public void encodeBasedOnNetworkAndDatabase() {
        try {
            URL url = new URL("http", "myfirstappwith.appspot.com", "index.html");
            String fileData = read.readDataFromUrl(String.valueOf(url));
            String encryptedData = encode.encodedData(fileData);
            write.writeDataInDatabase(encryptedData);

        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

