package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Fn = Fn-1 + Fn-2 (n >= 2) 0, 1, 1, 2, 3, 5...
        int fibonacci[] = new int[46];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i < fibonacci.length; i ++){
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }
        int number = Integer.parseInt(br.readLine());
        bw.write(fibonacci[number]+"");

        bw.flush();
        bw.close();
    }
}
