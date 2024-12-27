package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29684 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            String[] input = br.readLine().split(" ");
            int min = Integer.MAX_VALUE, index = 0;
            for (int i = 0; i < input.length; i++) {
                int sub = Math.abs(2023 - Integer.parseInt(input[i]));
                if(sub < min) {
                    min = sub;
                    index = i;
                }
            }
            bw.write(index+1+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
