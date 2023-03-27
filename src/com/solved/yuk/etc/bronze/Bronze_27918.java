package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27918 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            X = 0, Y = 0;
        String input;
        for(int i = 0; i < N; i++){
            input = br.readLine();
            if("D".equals(input)) X++;
            else if("P".equals(input)) Y++;
            if(X - 2 >= Y || Y - 2 >= X) break;
        }
        bw.write(X + ":" + Y);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

