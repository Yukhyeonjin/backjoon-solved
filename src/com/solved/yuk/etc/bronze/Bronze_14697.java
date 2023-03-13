package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]),
            N = Integer.parseInt(input[3]),
            answer = 0;
        for(int i = 0; i <= 300; i ++){
            for(int j = 0; j <= 150; j ++){
                for(int k = 0; k <= 100; k ++){
                    if(N == (A*i) + (B*j) + (C*k)) {
                        answer = 1;
                        break;
                    }
                }
                if(answer == 1) break;
            }
            if(answer == 1) break;
        }
        bw.write(answer+"");

        bw.flush();
        br.close();
        bw.close();
    }

}


