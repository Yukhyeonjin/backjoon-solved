package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bronze_15232 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1<<17);
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Bronze_15232().solution();
    }
}

