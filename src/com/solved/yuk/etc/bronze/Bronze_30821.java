package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30821 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), sum = 1;
        bw.write(combination(N,5)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static int combination(int n, int r) {
        if(n == r || r == 0)
            return 1;
        else
            return combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
