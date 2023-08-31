package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1440 {

    static int result = 0;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(":");
        int d1 = Integer.parseInt(input[0]),
            d2 = Integer.parseInt(input[1]),
            d3 = Integer.parseInt(input[2]);
        isTime(d1, d2, d3);
        isTime(d1, d3, d2);
        isTime(d2, d1, d3);
        isTime(d2, d3, d1);
        isTime(d3, d1, d2);
        isTime(d3, d2, d1);
        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void isTime(int h, int m, int s){
        if((h >= 1 && h <= 12) &&
           (m >= 00 && m <= 59) && (s >= 00 && s <= 59)) {
            result++;
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

