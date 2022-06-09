package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]);
        bw.write((Math.min(N,M)/2) +"");

        bw.flush();
        bw.close();
    }
}
