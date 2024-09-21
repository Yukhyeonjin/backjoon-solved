package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3276 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int a = 1, b = 1;
        while (a*b < N) {
            if(a > b) b+=1;
            else a+=1;
        }
        bw.write(a + " " + b);

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}