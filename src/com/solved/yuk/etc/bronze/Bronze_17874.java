package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17874 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]),
            h = Integer.parseInt(input[1]),
            v = Integer.parseInt(input[2]);
        int cake1 = h*v*4,
            cake2 = (n-h)*v*4,
            cake3 = (n-v)*h*4,
            cake4 = (n-v)*(n-h)*4;
        int max = Math.max(cake1, Math.max(cake2, Math.max(cake3, cake4)));
        bw.write(max+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
