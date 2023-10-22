package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_11931 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            arr[] = new int[N];
        for(int i = 0;i < N; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i = N-1;i >= 0; i --){
            bw.write(arr[i]+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
