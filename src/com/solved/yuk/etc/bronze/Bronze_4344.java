package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int k = Integer.parseInt(input[0]), sum = 0, count = 0;
            for(int j = 1; j <= k; j ++){
                sum += Integer.parseInt(input[j]);
            }
            double avg = sum/k;
            for(int j = 1; j <= k; j ++){
                if(avg < Integer.parseInt(input[j])) count++;
            }
            double rate = (double)count/k*100;
            bw.write(String.format("%.3f",rate)+"%\n");
        }
        bw.flush();
        bw.close();
    }
}
