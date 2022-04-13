package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0, max = 0;
        String input[];
        for(int i = 0; i < 10; i++){
            input = br.readLine().split(" ");
            int out = Integer.parseInt(input[0]), in = Integer.parseInt(input[1]);
            sum = sum + in - out;
            max = Math.max(sum, max);
        }
        bw.write(max+"");

        bw.flush();
        bw.close();
    }
}
