package com.company.data;

import java.io.*;

public class TimeFileReader {
    private static final String FILE_NAME = "/input.txt";

    public static String read(String filePath) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath + FILE_NAME))){
            String line;
            StringBuilder fileBuffer = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                fileBuffer.append(line);
                fileBuffer.append(" ");
            }
            return fileBuffer.toString();
        } catch (IOException exception) {
            return "Check file path or your file name";
        }
    }

    public static boolean isLineValid(String line){
        if (line == null || line.isEmpty()){
            return false;
        } else return true;
    }




}



