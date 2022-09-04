package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24416 {
    static int f[], count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        f = new int[n+1];
        fib(n);
        bw.write(count+" ");
        count = 0;
        fibonacci(n);
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static int fib(int n) {
        if(n == 1  || n == 2) {
            count++;
            return 1;
        }
        else return (fib(n-1) + fib(n-2));
    }

    public static int fibonacci(int n){
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i ++){
            count++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
