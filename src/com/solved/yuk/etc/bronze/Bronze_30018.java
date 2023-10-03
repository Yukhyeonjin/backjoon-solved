package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30018 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), a[] = new int[N], b[] = new int[N];
        String[] input;
        input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            a[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            b[i] = Integer.parseInt(input[i]);
        }

        int change = 0;
        for(int i = 0; i < N; i ++){
            change += Math.abs(a[i]-b[i]);
        }
        bw.write(change/2+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

