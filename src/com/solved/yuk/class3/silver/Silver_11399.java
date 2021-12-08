package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i ++){
            int number = Integer.parseInt(input[i]);
            arr[i] = number;
        }
        Arrays.sort(arr);
        int sum = 0, totalSum = 0;
        for(int i = 0; i < N; i ++){
            sum += arr[i];
            totalSum += sum;
        }
        bw.write(totalSum+"");



        bw.flush();
        bw.close();
    }
}
