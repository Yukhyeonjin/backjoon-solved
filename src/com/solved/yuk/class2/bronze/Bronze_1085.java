package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]),
            y = Integer.parseInt(input[1]),
            w = Integer.parseInt(input[2]),
            h = Integer.parseInt(input[3]);

        int xLength = x - 0 > w - x ? w - x : x - 0;
        int yLength = y - 0 > h - y ? h - y : y - 0;
        int output = xLength > yLength? yLength : xLength;
        bw.write(String.valueOf(output));

        bw.flush();
        bw.close();
    }
}
