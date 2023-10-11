package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20233 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()),
            x = Integer.parseInt(br.readLine()),
            b = Integer.parseInt(br.readLine()),
            y = Integer.parseInt(br.readLine()),
            T = Integer.parseInt(br.readLine());
        int aDay = Math.max(T - 30, 0)*x;
        int bDay = Math.max(T - 45, 0)*y;
        bw.write((aDay*21 + a) + " " +(bDay*21+b));

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

