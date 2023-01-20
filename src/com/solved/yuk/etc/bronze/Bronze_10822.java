package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10822 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(",");
        long sum = 0;
        for(int i = 0; i < input.length; i ++){
            sum+=Long.parseLong(input[i]);
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
