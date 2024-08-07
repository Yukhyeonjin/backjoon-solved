package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25991 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double sum = 0d;
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            double cur = Double.parseDouble(input[i]);
            sum += Math.pow(cur, 3);
        }
        bw.write(Math.cbrt(sum)+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}
