package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31831 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int stress = 0, cnt = 0;
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            stress += Integer.parseInt(input[i]);
            if(stress < 0) stress = 0;
            if(stress >= M) cnt++;
        }
        bw.write(cnt+"");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}