package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]),
            headMax = 0, bodyMax = 0;
        input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            headMax = Math.max(Integer.parseInt(input[i]), headMax);
        }
        input = br.readLine().split(" ");
        for(int i = 0; i < M; i ++){
            bodyMax = Math.max(Integer.parseInt(input[i]), bodyMax);
        }
        bw.write(headMax+bodyMax+"");


        bw.flush();
        br.close();
        bw.close();
    }
}
