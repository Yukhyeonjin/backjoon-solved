package com.solved.yuketc.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bronze_28135 {
	
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i - 1);
            if (s.contains("50")) cnt += 2;
            else cnt++;
        }

        System.out.print(cnt);

    }
	
}
