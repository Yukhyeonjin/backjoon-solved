package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Math.pow(A,2) = Math.pow(B,2)+N
        int N = Integer.parseInt(br.readLine()), count = 0;
        for(int i = 1; i <= 500; i ++){
            double A = Math.pow(i,2);
            for(int j = 1; j <= 500; j ++){
                double B = Math.pow(j,2);
                if(A == B+N) count++;
            }
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
