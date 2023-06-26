package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_1731 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), p[] = new int[n];
        for(int i = 0; i < n; i ++){
            p[i] = Integer.parseInt(br.readLine());
        }
        if(p[2] - p[1] == p[1] - p[0]) {
            bw.write(p[p.length - 1] + (p[1] - p[0])+"");
        } else {
            bw.write(p[p.length - 1] * (p[1] / p[0])+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
