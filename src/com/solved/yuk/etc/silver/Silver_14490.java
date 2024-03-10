package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_14490 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(":");
        int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);
        int gcd = gcd(n,m);
        n /= gcd;
        m /= gcd;
        bw.write(n+":"+m);

        bw.flush();
        br.close();
        bw.close();
    }

    public static int gcd(int n, int m){
        if(n % m == 0){
            return m;
        }

        return gcd(m, n % m);
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
