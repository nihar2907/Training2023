package net.media.training.designpattern.command;

import java.io.File;

public class deleteFile implements Operations{
    private String fileName;
    public deleteFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        File file = new File(fileName);
        file.delete();
    }
}
