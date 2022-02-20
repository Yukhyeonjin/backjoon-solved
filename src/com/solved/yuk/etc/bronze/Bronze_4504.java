package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), num;
        while ((num = Integer.parseInt(br.readLine())) != 0){
            if(num % n == 0) bw.write(num + " is a multiple of " + n +".\n");
            else bw.write(num + " is NOT a multiple of " + n +".\n");
        }

        bw.flush();
        bw.close();
    }
}
