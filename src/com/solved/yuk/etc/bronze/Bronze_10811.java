package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]);
        int arr[] = new int[N+1];
        for(int i = 1; i <= N; i ++){
            arr[i] = i;
        }
        for(int i = 0; i < M; i ++){
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]),
                y = Integer.parseInt(input[1]);
            for(int index = x; index <= (y - x) / 2 + x; index++) {
                int tmp = arr[index];
                arr[index] = arr[y - index + x];
                arr[y - index + x] = tmp;
            }
        }
        for(int i = 1; i <= N; i ++){
            bw.write(arr[i]+(i != N ? " " : ""));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
