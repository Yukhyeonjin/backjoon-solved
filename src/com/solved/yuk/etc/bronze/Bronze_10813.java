package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]);
        int [] arr = new int[N+1];

        for(int i = 1; i <= N; i ++){
            arr[i] = i;
        }
        for(int p = 0; p < M; p ++){
            input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]),
                j = Integer.parseInt(input[1]),
                temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 1; i <= N; i ++){
            bw.write(arr[i]+( i != N ? " " : ""));
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
