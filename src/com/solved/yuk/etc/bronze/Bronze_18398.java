package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18398 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){    
            int n = Integer.parseInt(br.readLine());
            String[] input;
            for(int j = 0; j < n; j ++){
                input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
                bw.write((a+b) + " " + (a*b)+"\n");
            }    
        }
        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
