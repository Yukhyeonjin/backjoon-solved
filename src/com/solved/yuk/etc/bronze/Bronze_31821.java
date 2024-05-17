package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31821 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int M = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < M; i ++){
            sum += arr[Integer.parseInt(br.readLine())-1];
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
