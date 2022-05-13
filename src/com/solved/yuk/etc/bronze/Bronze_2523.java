package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2523 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {    // 1 ~ N
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        for (int i = N - 1; i > 0; i--) {    // N+1 ~ 2N-1
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }

}