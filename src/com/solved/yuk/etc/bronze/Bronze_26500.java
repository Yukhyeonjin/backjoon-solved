package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26500 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i ++){
            String input[] = br.readLine().split(" ");

            double a = Double.parseDouble(input[0]);
            double b = Double.parseDouble(input[1]);

            double result = Math.abs(a - b);

            bw.write(String.format("%.1f", result)+"\n");
        }



        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

