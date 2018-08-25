package com.company.data;

public class TimeSeparator {

    public static int[] separate(String data) {
        String[] parsedData = data.split(" ");
        int[] time = new int[parsedData.length];
        for (int i = 0; i < parsedData.length; i++) {
            String[] value = parsedData[i].split(":");
            time[i] = Integer.parseInt(value[0]) * 60 + Integer.parseInt(value[1]);
        }
        return time;
    }

}
