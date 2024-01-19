package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28214 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int P = Integer.parseInt(input[2]);
        int cream, nonCream, set = 0;
        input = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            cream = 0;
            nonCream = 0;
            for(int j = 0; j < K; j++){
                if(Integer.parseInt(input[(i*K)+j]) == 1) {
                    cream++;
                }
                else {
                    nonCream++;
                }
            }
            if(nonCream < P) set++;
        }
        bw.write(set+"");


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
