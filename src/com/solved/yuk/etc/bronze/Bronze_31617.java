package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31617 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(input[i]);
        }
        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        input = br.readLine().split(" ");
        for (int i = 0; i < M; i++){
            B[i] = Integer.parseInt(input[i]);
        }

        int cnt = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if(A[i] + K == B[j]) cnt++;
            }
        }
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
