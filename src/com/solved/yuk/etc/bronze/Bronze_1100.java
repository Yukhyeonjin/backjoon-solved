package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1100 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        int count = 0;
        for (int i = 0; i < 8; i++) {
            input = br.readLine();
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    if(input.charAt(j) == 'F') count++;
                } else if(i % 2 != 0 && j % 2 != 0){
                    if(input.charAt(j) == 'F') count++;
                }
            }
        }
        bw.write(Integer.toString(count));

        bw.flush();
        bw.close();
    }
}
