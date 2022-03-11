package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine()), ballPosition = 1;
        String input[];
        for(int i = 0; i < M; i ++){
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]),
                y = Integer.parseInt(input[1]);
            if(ballPosition == x) ballPosition = y;
            else if(ballPosition == y) ballPosition = x;
        }
        bw.write(ballPosition+"");

        bw.flush();
        bw.close();
    }
}
