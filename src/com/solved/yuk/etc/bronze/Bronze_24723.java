package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            sum = 1;
        for(int i = 0; i < N; i ++){
            sum *= 2;
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
