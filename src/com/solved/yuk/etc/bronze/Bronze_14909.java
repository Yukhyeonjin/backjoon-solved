package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int count = 0;
        for(int i = 0; i < input.length; i ++){
            int num = Integer.parseInt(input[i]);
            if(num > 0) count++;
        }
        bw.write(count+"");


        bw.flush();
        br.close();
        bw.close();
    }
}

