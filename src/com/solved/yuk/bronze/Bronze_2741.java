package com.solved.yuk.bronze;

import java.io.*;

public class Bronze_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i ++) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
