package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31048 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++){
            int N = Integer.parseInt(br.readLine());
            int sum = 1;
            for(int j = 1; j <= N; j ++){
                sum *= j;
            }
            bw.write(sum%10+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}