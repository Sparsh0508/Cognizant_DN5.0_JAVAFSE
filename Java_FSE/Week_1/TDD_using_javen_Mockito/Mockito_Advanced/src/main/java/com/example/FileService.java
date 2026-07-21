package com.example;

public class FileService {

    private MyFileReader reader;
    private MyFileWriter writer;

    public FileService(MyFileReader reader,
                       MyFileWriter writer) {

        this.reader = reader;
        this.writer = writer;
    }

    public String processFile() {

        String data = reader.read();

        writer.write("Processed " + data);

        return "Processed " + data;
    }
}