package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23348 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] score = br.readLine().split(" "), input;
        int N = Integer.parseInt(br.readLine()),
                oneHand = Integer.parseInt(score[0]),
                noLook = Integer.parseInt(score[1]),
                phone = Integer.parseInt(score[2]);
        int sum = -1;
        for(int i = 0; i < N; i ++){
            int totalScore = 0;
            for(int j = 0; j < 3; j++){
                input = br.readLine().split(" ");
                totalScore = totalScore + (Integer.parseInt(input[0])*oneHand) + (Integer.parseInt(input[1])*noLook) + (Integer.parseInt(input[2])*phone);
            }
            sum = Math.max(sum, totalScore);
        }
        bw.write(sum + "");

        bw.flush();
        bw.close();
    }
}
