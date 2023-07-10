package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5666 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, arr[];
        while ((input = br.readLine()) != null){
            arr = input.split(" ");
            Double H = Double.parseDouble(arr[0]),
                   P = Double.parseDouble(arr[1]);
            bw.write(String.format("%.2f",H/P)+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
