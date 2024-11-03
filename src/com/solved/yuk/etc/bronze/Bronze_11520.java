package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11520 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++){
            String[] input = br.readLine().split(" ");
            int P = Integer.parseInt(input[0]);
            int D = Integer.parseInt(input[1]);
            bw.write(D + " 5" +"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}