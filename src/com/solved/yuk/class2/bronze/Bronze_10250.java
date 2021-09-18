package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 첫 번째 라인 입력 수
        String[] input;
        int H, W, N, quotient, remainder;
        String output;
        for(int i = 0; i < T; i ++) {
            input = br.readLine().split(" ");

            H = Integer.parseInt(input[0]); // 높이
            W = Integer.parseInt(input[1]); // 밑변
            N = Integer.parseInt(input[2]); // N번째 도착 손님

            quotient = N / H; //XX를 정하는 기준
            remainder = N % H; //YY를 정하는 기준 0일때는 H 아니면 나머지 값 그대로

            quotient = quotient == W || remainder == 0 ? quotient : quotient+1;
            remainder = remainder == 0 ? H : remainder;

            output = remainder + (quotient >= 10 ? quotient +"": "0"+quotient);
            bw.write(output);
            if(i+1 != T)bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
