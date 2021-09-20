package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_15829 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = 31;
        int MOD = 1234567891;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            long j = s.charAt(i) - 'a' + 1;
            for (int k = 0; k < i; k++) {
                j *= r;
                j %= MOD;
            }
            ans += j;
            ans %= MOD;
        }
        bw.write(Long.toString(ans));

        bw.flush();
        bw.close();
    }
}
