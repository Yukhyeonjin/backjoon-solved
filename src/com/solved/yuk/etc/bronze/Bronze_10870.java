package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()),
            fn[] = new int[n+1];
        fn[0] = 0;
        if(n >= 1){
            fn[1] = 1;
            for(int i = 2; i <= n; i ++){
                fn[i] = fn[i-1] + fn[i-2];
            }
        }
        bw.write(fn[n]+"");


        bw.flush();
        bw.close();
    }
}
