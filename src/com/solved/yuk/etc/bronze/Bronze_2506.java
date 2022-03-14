package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int sum = 0, score = 0;
        for(int i = 0; i < N; i ++){
            if(Integer.parseInt(input[i]) == 1) score++;
            else score = 0;
            sum+=score;
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
