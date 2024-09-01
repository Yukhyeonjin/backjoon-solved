package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20332 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n], sum = 0;
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i ++){
            arr[i] = Integer.parseInt(input[i]);
            sum += arr[i];
        }
        bw.write(sum % 3 == 0 ? "yes" : "no");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}