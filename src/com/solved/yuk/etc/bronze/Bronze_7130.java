package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_7130 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int C = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            if(C*M > H*B) sum += C*M;
            else sum += H*B;
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}