package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            K = 1, sec = 0;
        while (N > 0){
            if(N < K) {
                K = 1;
                continue;
            }else {
                N -= K;
                K++;
                sec ++;
            }
        }
        bw.write(sec+"");

        bw.flush();
        bw.close();
    }
}
