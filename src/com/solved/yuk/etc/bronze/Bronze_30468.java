package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30468 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int STR = Integer.parseInt(input[0]),
            DEX = Integer.parseInt(input[1]),
            INT = Integer.parseInt(input[2]),
            LUK = Integer.parseInt(input[3]),
            N   = Integer.parseInt(input[4]);
        int result = (N*4) - (STR+DEX+INT+LUK);
        if(result < 0) result = 0;
        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

