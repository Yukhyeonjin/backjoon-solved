package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32046 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        while ( (n = Integer.parseInt(br.readLine())) != 0 ) {
            String[] input = br.readLine().split(" ");
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(input[i]);
                if(sum + arr[i] > 300) continue;
                else sum += arr[i];
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}