package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29546 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i ++){
            arr[i] = br.readLine();
        }

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i ++){
            String[] input = br.readLine().split(" ");
            int l = Integer.parseInt(input[0]);
            int r = Integer.parseInt(input[1]);

            for (int j = l-1; j < r; j ++){
                bw.write(arr[j]);
                bw.newLine();
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}