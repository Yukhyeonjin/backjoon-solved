package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]);
        int[][] A = makeProceisson(br, N, M);

        input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int[][] B = makeProceisson(br, N, M);

        int[][] C = new int[A.length][B[0].length];
        for(int i = 0; i < A.length; i ++){
            for(int j = 0; j < B[0].length; j ++){
                for(int k = 0; k < A[0].length; k ++){
                    C[i][j] += A[i][k] * B[k][j];
                }
                bw.write(C[i][j] + " ");
            }
            bw.newLine();
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

    private static int[][] makeProceisson(BufferedReader br, int n, int m) throws IOException {
        String[] input;
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            for(int j = 0; j < m; j ++){
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        return arr;
    }

}
