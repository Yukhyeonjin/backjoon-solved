package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32432 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        if(N == 1) bw.write(K+"");
        else {
            int i = 1;
            int sum;
            while (true) {
                sum = (N*i) + N-1;
                if(sum > K) break;
                i++;
            }
            bw.write(i-1+"");
        }


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}