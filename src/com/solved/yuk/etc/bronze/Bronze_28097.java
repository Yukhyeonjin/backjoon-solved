package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28097 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int day = 0, hour = 0;
        for(int i = 0; i < N; i ++){
            hour += Integer.parseInt(input[i]);
            if(i != N-1) hour += 8;
        }
        day = hour / 24;
        hour = hour % 24;
        bw.write(day + " " + hour);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

