package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_9723 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++){
            String[] input = br.readLine().split(" ");
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) arr[j] = Integer.parseInt(input[j]);
            Arrays.sort(arr);
            boolean answer = arr[2]*arr[2]==arr[0]*arr[0]+arr[1]*arr[1];
            bw.write(String.format("Case #%d: %s\n", i, answer?"YES":"NO"));
        }


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}