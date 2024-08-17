package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28940 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        int x = w / a;
        int y = h / b;

        if (a > w || b > h) {
            bw.write("-1");
        } else {
            bw.write(String.format("%.0f\n", Math.ceil((double) n / (x * y))));
        }


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}