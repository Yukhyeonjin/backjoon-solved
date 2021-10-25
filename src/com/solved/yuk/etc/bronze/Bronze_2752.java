package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int[] arr = {Integer.parseInt(input[0]),Integer.parseInt(input[1]),Integer.parseInt(input[2])};
        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[1] + " " + arr[2]);

        bw.flush();
        bw.close();

    }
}
