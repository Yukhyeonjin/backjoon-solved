package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29097 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int a = Integer.parseInt(input[3]);
        int b = Integer.parseInt(input[4]);
        int c = Integer.parseInt(input[5]);
        int max = Math.max(a*n, Math.max(b*m, c*k));
        if(max == a * n) {
            sb.append("Joffrey");
        }
        if(max == b * m) {
            if(sb.length() > 0) sb.append(" ");
            sb.append("Robb");
        }
        if(max == c * k) {
            if(sb.length() > 0) sb.append(" ");
            sb.append("Stannis");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}