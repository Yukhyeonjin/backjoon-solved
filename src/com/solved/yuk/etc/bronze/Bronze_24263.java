package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        bw.write(T+"\n"+"1");

        bw.flush();
        br.close();
        bw.close();
    }
}
