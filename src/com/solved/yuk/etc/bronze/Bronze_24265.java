package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24265 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //(n-1) *  n / 2
        long n = Long.parseLong(br.readLine());
        long count = n*(n-1)/2;
        bw.write(count+"\n2");

        bw.flush();
        br.close();
        bw.close();
    }
}
