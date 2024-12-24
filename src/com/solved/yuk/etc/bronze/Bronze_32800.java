package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32800 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0, max = -1;
        for (int i = 0; i < N; i ++) {
            String[] input = br.readLine().split(" ");
            
            sum -= Integer.parseInt(input[0]);
            sum += Integer.parseInt(input[1]);
            
            max = Math.max(sum, max);
        }
        bw.write(max+"");
        

        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
