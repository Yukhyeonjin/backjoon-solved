package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_22015 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int arr[] = new int[3];
        arr[0] = Integer.parseInt(input[0]);
        arr[1] = Integer.parseInt(input[1]);
        arr[2] = Integer.parseInt(input[2]);
        Arrays.sort(arr);
        bw.write(((arr[2]-arr[1]) + (arr[2] - arr[0]))+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

