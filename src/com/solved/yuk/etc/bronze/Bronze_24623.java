package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24623 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double alpha = Double.parseDouble(br.readLine());
        int round = (int)(Math.round((180 - alpha) / 2 + alpha / 2));
        bw.write(round+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}