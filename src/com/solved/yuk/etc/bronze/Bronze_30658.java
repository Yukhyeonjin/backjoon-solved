package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30658 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        while (0 != (N = Integer.parseInt(br.readLine()))) {
            int arr[] = new int[N];
            for (int i = 0; i < N; i ++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            for (int i = N-1; i >= 0; i --){
                bw.write(arr[i]+"\n");
            }
            bw.write("0\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}