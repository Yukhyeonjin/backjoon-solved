package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]), count = 0;
            // 0 < a < b < n
            for(int a = 1; a < n-1; a ++){
                for(int b = a+1; b < n; b ++){
                    double result = (Math.pow(a,2) + Math.pow(b,2) + m)/(a*b);
                    if(result == Math.floor(result) && !Double.isInfinite(result)) count++;
                }
            }
            bw.write(count+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
