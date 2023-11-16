package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_11728 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]);
        int [] arr = new int[N+M];
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i]= Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            arr[i+N]= Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < N+M; i++) {
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
