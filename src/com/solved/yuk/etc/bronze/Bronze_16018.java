package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16018 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String x[] = br.readLine().split(""),
               y[] = br.readLine().split("");
        int cnt = 0;
        for (int i = 0; i < N; i ++){
            if("C".equals(x[i]) && x[i].equals(y[i])) cnt++;
        }
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

