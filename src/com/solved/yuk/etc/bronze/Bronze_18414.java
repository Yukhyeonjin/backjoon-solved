package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_18414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int arr[] = new int[3];
        for(int i = 0; i < 3; i ++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        bw.write(arr[1]+"");

        bw.flush();
        br.close();
        bw.close();

    }
}
