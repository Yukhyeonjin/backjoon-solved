package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21612 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int B = Integer.parseInt(br.readLine());
        int P = 5 * B - 400;
        P = Math.abs(P);
        bw.write(P+"\n");
        bw.write(P > 100 ? "-1" : P < 100 ? "1":"0");

        bw.flush();
        br.close();
        bw.close();
    }
}
