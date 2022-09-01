package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(br.readLine().toUpperCase());

        bw.flush();
        br.close();
        bw.close();
    }
}
