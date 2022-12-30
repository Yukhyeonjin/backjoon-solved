package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18406 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("");
        int leftSum = 0, rightSum = 0;
        for(int i = 0; i < input.length/2; i ++){
            leftSum += Integer.parseInt(input[i]);
        }
        for(int i = input.length/2; i < input.length; i ++){
            rightSum += Integer.parseInt(input[i]);
        }
        bw.write(leftSum == rightSum ? "LUCKY" : "READY");


        bw.flush();
        bw.close();
        br.close();
    }
}