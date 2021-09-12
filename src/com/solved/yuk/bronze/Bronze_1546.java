package com.solved.yuk.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countSubject = Integer.parseInt(br.readLine().toString());
        String[] scoreStr = br.readLine().split(" ");
        Double[] score = new Double[countSubject];
        double max = 0;
        for(int i = 0; i < countSubject; i ++) {
            score[i] = Double.parseDouble(scoreStr[i]);
            max = Math.max(max, score[i]);
        }
        double avr = 0;
        for(int i = 0; i < countSubject; i ++) {
            avr += score[i]/max*100;
        }
        avr = avr/countSubject;
        System.out.println(avr);
    }
}
