package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32458 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double x = Double.parseDouble(br.readLine());
        bw.write((int)x+"");


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}