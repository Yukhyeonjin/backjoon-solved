package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10821 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(",");
        bw.write(input.length+"");

        bw.flush();
        br.close();
        bw.close();
    }
}