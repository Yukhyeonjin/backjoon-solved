package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30394 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String[] input;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            min = Math.min(min, Integer.parseInt(input[1]));
            max = Math.max(max, Integer.parseInt(input[1]));
        }
        bw.write(max-min+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}