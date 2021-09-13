package com.solved.yuk.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] str = new String[T];
        for(int i = 0; i < T; i++){
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String[] S = input[1].split("");
            String strComponent = "";
            for(int j = 0; j < S.length; j++) {
                for(int k = 0; k < R; k ++) {
                    strComponent += S[j];
                }
            }
            str[i] = strComponent;
        }
        for(String s : str) System.out.println(s);
    }
}
