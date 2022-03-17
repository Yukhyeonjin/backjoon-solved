package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2566 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[];
        int max = -1, x = 0, y = 0;
        for(int i = 0; i < 9; i ++){
            input = br.readLine().split(" ");
            for(int j = 0; j < 9; j ++){
                int num = Integer.parseInt(input[j]);
                if(max < num) {
                    max = num;
                    x = i+1;
                    y = j+1;
                }
            }
        }
        bw.write(max+"\n"+x + " " + y);

        bw.flush();
        bw.close();
    }
}
