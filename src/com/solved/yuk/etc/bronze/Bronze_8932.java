package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_8932 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()), sum = 0;
        double arr[][] = {{9.23076, 26.7, 1.835},
                          {1.84523, 75, 1.348},
                          {56.0211, 1.5, 1.05},
                          {4.99087, 42.5, 1.81},
                          {0.188807, 210, 1.41},
                          {15.9803, 3.8, 1.04},
                          {0.11193, 254, 1.88}};
        for(int i = 0; i < t; i ++){
            sum = 0;
            String input[] = br.readLine().split(" ");
            for(int j = 0; j < 7; j ++){
                sum += arr[j][0] * Math.pow(Math.abs(Integer.parseInt(input[j]) - arr[j][1]), arr[j][2]);
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
