package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), min, sum;
        String input[];
        for(int i = 0; i < T; i ++){
            input = br.readLine().split(" ");
            sum = 0;
            min = Integer.MAX_VALUE;
            for(int j = 0; j < input.length; j++){
                int number = Integer.parseInt(input[j]);
                if(number % 2 == 0) {
                    min = Math.min(number, min);
                    sum+= number;
                }
            }
            bw.write(sum + " " + min + "\n");
        }

        bw.flush();
        bw.close();
    }
}
