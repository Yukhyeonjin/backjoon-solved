package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18127 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        long sum = 1;
        long plus = A-1;
        for (int i = 0; i < B; i++){
            sum+=plus;
            plus += (A-2);
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