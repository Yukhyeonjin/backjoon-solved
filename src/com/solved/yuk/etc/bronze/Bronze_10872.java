package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(factorial(N)+"");

        bw.flush();
        bw.close();
    }

    public static int factorial(int n){
        if(n <= 1) return 1;
        else return n * factorial(n-1);
    }
}
