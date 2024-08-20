package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27465 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean flag = true;
        int cnt = N;

        while (flag) {
            if (!isPrime(cnt)) {
                bw.write(cnt+"\n");
                flag = false;
            }
            cnt++;
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}