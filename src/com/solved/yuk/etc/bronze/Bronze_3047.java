package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // A < B < C
        String input[] = br.readLine().split(" ");
        int arr[] = new int [3];
        arr[0] = Integer.parseInt(input[0]);
        arr[1] = Integer.parseInt(input[1]);
        arr[2] = Integer.parseInt(input[2]);
        Arrays.sort(arr);
        String alphabet = br.readLine();
        for(int i = 0; i < alphabet.length(); i ++){
            bw.write(arr[(int)(alphabet.charAt(i) - 'A')]+" ");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
