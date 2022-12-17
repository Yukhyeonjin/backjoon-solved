package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5341 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input;
        while ((input = Integer.parseInt(br.readLine()))!=0){
            int sum = 0;
            for(int i = 1; i <= input; i ++){
                sum += i;
            }
            bw.write(sum+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}