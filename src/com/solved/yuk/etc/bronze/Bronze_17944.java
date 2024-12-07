package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17944 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int T = Integer.parseInt(input[1]);
        int result = 0;
        boolean flag = false;
        for(int i = 0; i < T; ++i) {
            if(result == 2 * N) flag = true;
            else if(result == 1) flag = false;

            if(flag) result--;
            else result++;
        }
        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}