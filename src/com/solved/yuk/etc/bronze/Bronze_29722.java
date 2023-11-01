package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29722 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("-");
        int year  = Integer.parseInt(input[0]),
            month = Integer.parseInt(input[1]),
            day   = Integer.parseInt(input[2]),
            N = Integer.parseInt(br.readLine());
        // 년도
        year = year + (N/360);
        N = N%360;
        // 월
        month = month + (N/30);
        N = N%30;
        // 일
        day = day + N;

        if (day > 30) {
            day = day - 30;
            month++;
        }
        if(month > 12) {
            month = month - 12;
            year++;
        }
        bw.write(String.format("%d-%02d-%02d", year, month, day));

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

