package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_5074 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"00:00 00:00".equals(input = br.readLine())) {
            String[] inputArr = input.split(" ");
            String startTime = inputArr[0];
            String durTime = inputArr[1];
            int startHour = Integer.parseInt(startTime.substring(0,2));
            int startMin = Integer.parseInt(startTime.substring(3));
            int durHour = Integer.parseInt(durTime.substring(0,2));
            int durMin = Integer.parseInt(durTime.substring(3));

            int endHour = startHour + durHour;
            int endMin = startMin + durMin;

            int extraDay = 0;
            if (endMin >= 60) {
                endHour++;
                endMin -= 60;
            }
            if (endHour >= 24) {
                extraDay = endHour / 24;
                endHour %= 24;
            }
            bw.write(String.format("%02d:%02d",endHour, endMin) + (extraDay != 0 ? " +"+extraDay: "") +"\n");
        }



        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}