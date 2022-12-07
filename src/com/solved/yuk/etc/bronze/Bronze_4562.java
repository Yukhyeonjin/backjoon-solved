package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4562 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]),
                y = Integer.parseInt(input[1]);
            bw.write(x < y ? "NO BRAINS\n" : "MMM BRAINS\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}