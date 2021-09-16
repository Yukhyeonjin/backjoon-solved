package com.solved.yuk.bronze;

import java.io.*;

public class Bronze_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        input[0] = String.valueOf(input[0].charAt(2)) + String.valueOf(input[0].charAt(1)) + String.valueOf(input[0].charAt(0));
        input[1] = String.valueOf(input[1].charAt(2)) + String.valueOf(input[1].charAt(1)) + String.valueOf(input[1].charAt(0));
        bw.write( Integer.parseInt(input[0]) > Integer.parseInt(input[1]) ? input[0] : input[1]);

        bw.flush();
        bw.close();
    }
}
