package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_6840 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[3];
        arr[0] = Integer.parseInt(br.readLine());
        arr[1] = Integer.parseInt(br.readLine());
        arr[2] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        bw.write(arr[1]+"");


        bw.flush();
        br.close();
        bw.close();
    }
}