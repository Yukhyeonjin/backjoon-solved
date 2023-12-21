package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_28147 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), run,
            trick[] = new int[5], score, max = -1;
        String[] input;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            run = Math.max(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            for(int j = 0; j < 5; j ++){
                trick[j] = Integer.parseInt(input[j+2]);
            }
            Arrays.sort(trick);
            max = Math.max(run + trick[3] + trick[4], max);
        }
        bw.write(max+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

