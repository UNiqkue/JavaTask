package com.company.data;

import java.util.Arrays;

public class ResultAnalyzer {

    public static int analyze(int[] time) {
        int[][] workingTime = new int[time.length][2];
        for (int i = 0; i < time.length; i++) {
            workingTime[i][0] = time[i];
            workingTime[i][1] = (i % 2 == 0) ? 1 : -1;
        }

        Arrays.sort(workingTime, (first, second) -> {
            if ( first[0] < second[0] ) return -1;
            else if ( first[0] == second[0] && first[1] > second[1]) return -1;
            else if ( first[0] == second[0] && first[1] < second[1]) return 0;
            else return 1;
        });

        int result = 0;
        for (int i = 0, currentNumber = 0; i < time.length; i++) {
            currentNumber += workingTime[i][1];
            result = Math.max(result, currentNumber);
        }
        return result;
    }
    }

