package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30791 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int cnt = 0;
        if (a - 1000 <= b) cnt++;
        if (a - 1000 <= c) cnt++;
        if (a - 1000 <= d) cnt++;
        if (a - 1000 <= e) cnt++;
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

