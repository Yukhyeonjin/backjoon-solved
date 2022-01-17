package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input = br.readLine();
            bw.write(String.valueOf(input.charAt(0)).toUpperCase()+input.substring(1,input.length()));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
