package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11340 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            double project = Integer.parseInt(input[0])*(15),
                   paper = Integer.parseInt(input[1])*(20),
                   midterm = Integer.parseInt(input[2])*(25);
            // 90 = a + b + c + d*(0.4) -> d = (90 - a - b - c) / 0.4
            int finalExam = (9000 - project - paper - midterm) % 40 == 0 ? (int)((9000 - project - paper - midterm) / 40)  : (int)(((9000 - project - paper - midterm) / 40) + 1);
            bw.write((finalExam > 100 ? "impossible" : finalExam) +"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}