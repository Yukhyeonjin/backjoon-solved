package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_29139 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int sum = 0, arr[] = new int[n];
        for (int i = 0; i < n; i ++){
            sum += Integer.parseInt(input[i]);
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        bw.write(sum - arr[n-1]+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}