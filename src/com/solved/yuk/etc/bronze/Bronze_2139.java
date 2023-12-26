package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2139 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, inputArr[]; int year, month, day;
        int specialYear;
        int totalDay;
        int mArr[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
        while (!"0 0 0".equals(input = br.readLine())){
            inputArr = input.split(" ");
            year = Integer.parseInt(inputArr[2]);
            month = Integer.parseInt(inputArr[1]);
            day = Integer.parseInt(inputArr[0]);

            specialYear = 0;
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                specialYear = 1;
            }

            totalDay = 0;
            if (specialYear == 1 && month > 2) {
                ++totalDay;
            }

            for(int i=0; i<month; ++i){
                totalDay += mArr[i];
            }

            totalDay += day;

            bw.write(totalDay+"\n");

        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

