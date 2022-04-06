package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line[] = br.readLine().split(""), index[];
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            index = br.readLine().split(" ");
            int leftIndex    = Integer.parseInt(index[0]),
                rightIndex   = Integer.parseInt(index[1]);
            String leftStr   = line[leftIndex],
                   rightStr  = line[rightIndex];
            line[leftIndex]  = rightStr;
            line[rightIndex] = leftStr;
        }
        bw.write(String.join("",line));

        bw.flush();
        bw.close();
    }
}
