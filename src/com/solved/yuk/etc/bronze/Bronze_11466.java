package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11466 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        double arr[] = new double[2], ans;
        arr[0] = Math.min(Double.parseDouble(input[0]), Double.parseDouble(input[1]));
        arr[1] = Math.max(Double.parseDouble(input[0]), Double.parseDouble(input[1]));
        if(arr[0] * 3 < arr[1]) ans = arr[0];
        else if(arr[0] * 1.5 < arr[1]) ans = arr[1] / 3;
        else ans = arr[0] / 2;
        bw.write(String.format("%.3f", ans));

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
