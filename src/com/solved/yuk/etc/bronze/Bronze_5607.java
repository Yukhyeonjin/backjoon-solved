package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5607 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), aScore = 0, bScore = 0;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if(a > b) aScore += a + b;
            else if(a == b) {aScore += a; bScore += b;}
            else bScore += a + b;
        }
        bw.write(aScore + " " + bScore);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
