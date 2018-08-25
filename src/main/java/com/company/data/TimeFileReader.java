package com.company.data;

import java.io.*;

public class TimeFileReader {

    public static String read(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath + "/input.txt"));
        String line;
        StringBuilder fileBuffer = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            fileBuffer.append(line);
            fileBuffer.append(" ");
        }
        return fileBuffer.toString();
    }
}



