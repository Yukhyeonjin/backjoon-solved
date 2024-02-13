package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30033 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            A[] = new int[N],
            B[] = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i ++){
            A[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        int result = 0;
        for (int i = 0; i < N; i ++){
            B[i] = Integer.parseInt(input[i]);
            if(A[i] <= B[i]) result++;
        }
        bw.write(result+"");



        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
