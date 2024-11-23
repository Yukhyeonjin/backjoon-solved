package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13456 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), n, cnt;
        String[] a,b;
        for (int i = 0; i < T; i ++){
            n = Integer.parseInt(br.readLine());
            a = br.readLine().split(" ");
            b = br.readLine().split(" ");
            cnt = 0;
            for (int j = 0; j < n; j ++){
                if(Integer.parseInt(a[j]) != Integer.parseInt(b[j])) cnt++;
            }
            bw.write(cnt+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}