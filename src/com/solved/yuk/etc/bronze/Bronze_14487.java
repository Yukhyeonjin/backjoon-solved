package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_14487 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), arr[] = new int[n], sum = 0;
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < n; i ++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i ++){
            sum += arr[i];
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

