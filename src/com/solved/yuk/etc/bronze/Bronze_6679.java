package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6679 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 2992;
        for(;n <= 9999; n ++){
            int tmp = n,
                num1 = 0,
                num2 = 0,
                num3 = 0;

            // 10진수 의 각 자릿수 덧셈
            while(tmp != 0) {
                num1 += tmp%10;
                tmp /= 10;
            }
            // 12진수 의 각 자릿수 덧셈
            tmp = n;
            while(tmp != 0) {
                num2 += tmp%12;
                tmp /= 12;
            }
            // 16진수 의 각 자릿수 덧셈
            tmp = n;
            while(tmp != 0) {
                num3 += tmp%16;
                tmp /= 16;
            }

            if(num1 == num2 && num2 == num3) bw.write(n+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

