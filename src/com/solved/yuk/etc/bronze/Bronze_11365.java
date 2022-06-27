package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"END".equals(input = br.readLine())){
            bw.write(new StringBuilder(input).reverse().toString());
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
