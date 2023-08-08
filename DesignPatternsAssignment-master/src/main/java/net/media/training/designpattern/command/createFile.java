package net.media.training.designpattern.command;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class createFile implements Operations{
    private String fileName;
    private String content;

    public createFile(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }
    @Override
    public void execute() {
        File file = new File(fileName);
        if (file.exists())
            throw new RuntimeException("File already exist");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
