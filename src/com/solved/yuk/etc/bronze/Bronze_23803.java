package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23803 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // String.repeat - java 11 버전 문자열 곱 가능
        String x = "", y = "";
        for(int i = 0; i < N; i ++){
            x+="@";
            for(int j = 0; j < 5; j ++){ y+="@"; }
        }
        for(int i = 0; i < 4*N; i ++){
            bw.write(x+"\n");
        }
        for(int i = 0; i < N; i ++){
            bw.write(y+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

