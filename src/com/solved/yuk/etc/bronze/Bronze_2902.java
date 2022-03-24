package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("-");
        for(int i = 0; i < input.length; i ++){
            bw.write(input[i].charAt(0));
        }

        bw.flush();
        bw.close();
    }
}
