package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26530 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input;
        int x;
        double sum;
        for (int i = 0; i < n; i ++){
            x = Integer.parseInt(br.readLine());
            sum = 0;
            for (int j = 0; j < x; j ++){
                input = br.readLine().split(" ");
                sum = sum + (Double.parseDouble(input[1]) * Double.parseDouble(input[2]));
            }
            bw.write(String.format("$%.2f\n",sum));
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
