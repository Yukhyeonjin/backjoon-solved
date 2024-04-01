package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10406 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int W = Integer.parseInt(input[0]),
            N = Integer.parseInt(input[1]),
            P = Integer.parseInt(input[2]);
        input = br.readLine().split(" ");
        int cnt = 0;
        for (int i = 0; i < P; i ++){
            int num = Integer.parseInt(input[i]);
            if(num >= W && num <= N) cnt++;
        }
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
