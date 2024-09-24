package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31833 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[] A = new long[N], B = new long[N];
        String resultA = "", resultB = "";
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i ++){
            A[i] = Long.parseLong(input[i]);
            resultA += A[i];
        }
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i ++){
            B[i] = Long.parseLong(input[i]);
            resultB += B[i];
        }
        if(Long.parseLong(resultA) > Long.parseLong(resultB)) {
            bw.write(resultB);
        }
        else if(Long.parseLong(resultA) < Long.parseLong(resultB)) {
            bw.write(resultA);
        }
        else {
            bw.write(resultA);
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}