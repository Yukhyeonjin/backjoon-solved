package com.solved.yuk.class1.bronze;

import java.io.*;

public class Bronze_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int max = -1000001;
        int min = 1000001;
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++) {
            max = max < Integer.parseInt(input[i]) ? Integer.parseInt(input[i]) : max;
            min = min > Integer.parseInt(input[i]) ? Integer.parseInt(input[i]) : min;
        }
        bw.write(min + " " + max);

        bw.flush();
        bw.close();
    }
}
