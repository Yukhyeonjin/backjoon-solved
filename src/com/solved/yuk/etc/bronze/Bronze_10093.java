package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10093 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        long a = Math.min(Long.parseLong(input[0]), Long.parseLong(input[1])),
             b = Math.max(Long.parseLong(input[0]), Long.parseLong(input[1]));
        if(a == b) bw.write("0");
        else {
            bw.write((b - a - 1) + "\n");
            for(long i = a+1; i < b; i ++){
                bw.write(i+" ");
            }
        }



        bw.flush();
        bw.close();
        br.close();
    }
}