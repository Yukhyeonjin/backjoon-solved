package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28281 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), X = Integer.parseInt(input[1]), min = Integer.MAX_VALUE;
        input = br.readLine().split(" ");
        for(int i = 0; i < N-1; i ++){
            min = Math.min(min, Integer.parseInt(input[i]) + Integer.parseInt(input[i+1]));
        }
        bw.write((min*X)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
