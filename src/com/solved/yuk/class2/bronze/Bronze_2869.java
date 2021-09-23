package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]),
             B = Long.parseLong(input[1]),
             V = Long.parseLong(input[2]);

        long day = (V - B) / (A - B); // 최소한 무조건 가야하는 날짜
        day = (V - B) % (A - B) != 0 ? day+1 : day;
        bw.write(Long.toString(day));

        bw.flush();
        bw.close();
    }
}
