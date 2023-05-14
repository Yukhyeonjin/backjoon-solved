package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20833 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), sum = 0;
        for(int i = 1; i <= N; i ++){
            sum += Math.pow(i,3);
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

