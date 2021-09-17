package com.solved.yuk.class1.bronze;

import java.io.*;

public class Bronze_10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        bw.write(Integer.parseInt(input[0]) * Integer.parseInt(input[1]) + "");

        bw.flush();
        bw.close();
    }
}
