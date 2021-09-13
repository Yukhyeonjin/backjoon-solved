package com.solved.yuk.bronze;

import java.io.*;

public class Bronze_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i ++) {
            bw.write(N-i+1 + "\n");
        }
        bw.flush();
        bw.close();
    }
}
