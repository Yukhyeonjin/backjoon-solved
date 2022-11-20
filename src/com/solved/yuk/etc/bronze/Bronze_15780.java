package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15780 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), K = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        for(int i = 0; i < K; i ++){
            int A = Integer.parseInt(input[i]);
            if(A % 2 == 0) {
                N -= A/2;
            }
            else {
                N -= (A/2)+1;
            }
        }
        bw.write(N<=0?"YES":"NO");


        bw.flush();
        br.close();
        bw.close();
    }
}
