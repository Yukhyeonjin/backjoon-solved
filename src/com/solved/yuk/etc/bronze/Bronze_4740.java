package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4740 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"***".equals(input = br.readLine())){
            for(int i = input.length()-1; i >= 0 ; i --){
                bw.write(String.valueOf(input.charAt(i)));
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
