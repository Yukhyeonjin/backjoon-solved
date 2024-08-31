package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16785 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        int coin = 0, day = 0;
        while (coin < C) {
            day++;
            if(day % 7 == 0) coin+=B;
            coin += A;
        }
        bw.write(day+"");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}