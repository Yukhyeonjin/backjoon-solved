package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine()),
                door[] = new int[n+1];
            for(int j = 1; j <= n; j++){
                for(int k = 1; k*j <= n; k++){
                    if(door[k*j] == 0) door[k*j] = 1;
                    else door[k*j] = 0;
                }
            }
            int count = 0;
            for(int j = 1; j <= n; j ++){
                if(door[j] == 1) count++;
            }
            bw.write(count+"\n");
        }

        bw.flush();
        bw.close();
    }
}
