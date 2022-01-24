package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11282 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 가 : 44032
        bw.write(((char)(44031+Integer.parseInt(br.readLine())))+"");

        bw.flush();
        bw.close();
    }
}
