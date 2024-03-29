package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bronze_25630 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n/2; i++)
            if (s.charAt(i) != s.charAt(n-1-i))
                cnt++;
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        new Bronze_25630().solution();
    }
}
