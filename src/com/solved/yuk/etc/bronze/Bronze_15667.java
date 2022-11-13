package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), K = 1;
        // N = 1 + K + K*K;
        // N - 1 = K*(K+1);
        while (true){
            if(N - 1 == K*(K+1)) break;
            K++;
        }
        bw.write(K+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
