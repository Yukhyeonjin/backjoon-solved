package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), min = 1001, max = -1;
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            int score = Integer.parseInt(input[i]);
            max = Math.max(score,max);
            min = Math.min(score,min);
        }
        bw.write(max-min+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
