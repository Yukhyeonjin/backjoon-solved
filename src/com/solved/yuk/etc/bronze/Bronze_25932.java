package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25932 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.contains("17") && input.contains("18")) {
                bw.write(input+"\nboth\n");
            } else if (input.contains("17")) {
                bw.write(input+"\nzack\n");
            } else if (input.contains("18")) {
                bw.write(input+"\nmack\n");
            } else {
                bw.write(input+"\nnone\n");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}