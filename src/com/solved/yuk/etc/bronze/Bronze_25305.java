package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Bronze_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        Integer arr[] = new Integer[N];
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        bw.write(arr[k-1]+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
