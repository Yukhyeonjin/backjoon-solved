package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21553 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String P = br.readLine();
        bw.write(P);


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}