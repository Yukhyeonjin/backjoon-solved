package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32216 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int T = Integer.parseInt(input[2]);

        input = br.readLine().split(" ");
        int[] d = new int[n+1];
        for (int i = 1; i <= n; i++){
            d[i] = Integer.parseInt(input[i-1]);
        }
        int[] t = new int[n+1];
        t[0] = T;
        for (int i = 1; i <= n; i++){
            if(t[i-1] > k) {
                t[i] = t[i-1] + d[i] - Math.abs(t[i-1]-k);
            }
            else if(t[i-1] < k) {
                t[i] = t[i-1] + d[i] + Math.abs(t[i-1]-k);
            }
            else {
                t[i] = t[i-1] + d[i];
            }
        }
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += Math.abs(t[i]-k);
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