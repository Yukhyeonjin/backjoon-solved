package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        long N = Long.parseLong(input[0]),
             M = Long.parseLong(input[1]);
        bw.write((N*M/2)+"");

        bw.flush();
        bw.close();
    }
}
