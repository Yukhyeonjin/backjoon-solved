package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26561 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), p, t;
        String[] input;
        for(int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            p = Integer.parseInt(input[0]);
            t = Integer.parseInt(input[1]);
            p += t/4;
            p -= t/7;
            bw.write(p+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

