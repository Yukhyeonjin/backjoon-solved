package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8545 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        bw.write(new StringBuilder(input).reverse().toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
