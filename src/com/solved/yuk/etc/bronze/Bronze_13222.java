package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13222 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int H = Integer.parseInt(input[2]);
        int len = (W*W)+(H*H);
        for (int i = 0; i < N; i ++){
            int cur = Integer.parseInt(br.readLine());
            if(cur*cur <= len) bw.write("YES\n");
            else bw.write("NO\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

