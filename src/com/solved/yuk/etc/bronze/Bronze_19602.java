package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_19602 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int S = Integer.parseInt(br.readLine()),
            M = Integer.parseInt(br.readLine()),
            L = Integer.parseInt(br.readLine());
        int sum = 1*S + 2*M + 3*L;
        bw.write(sum >= 10 ? "happy" : "sad");

        bw.flush();
        br.close();
        bw.close();
    }
}
