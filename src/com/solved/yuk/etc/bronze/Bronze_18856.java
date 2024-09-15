package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18856 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(N+"\n");

        int arr[] = new int[N];
        arr[0] = 1; arr[1] = 2;
        for (int i = 2; i < N; i ++){
            arr[i] = arr[i-1] + 1;
        }
        arr[N-1] = 997;
        for (int i = 0; i < N; i ++){
            bw.write(arr[i]+" ");
        }



        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}