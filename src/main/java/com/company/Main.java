package com.company;

import com.company.data.ResultAnalyzer;
import com.company.data.TimeSeparator;
import com.company.data.TimeFileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter input.txt path");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = bufferedReader.readLine();
        System.out.println(ResultAnalyzer.analyze(TimeSeparator.separate(TimeFileReader.read(filePath))));
    }

}
