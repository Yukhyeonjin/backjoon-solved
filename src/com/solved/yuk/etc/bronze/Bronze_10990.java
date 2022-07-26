package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i ++){
            if(i == 1){
                for(int j = 0; j < N-1; j++){
                    bw.write(" ");
                }
                bw.write("*");
            }
            else {
                for(int j = 0; j < N; j++){
                    if(N - i == j) bw.write("*");
                    else bw.write(" ");
                }
                for(int j = 0; j < N-1; j++){
                    if(i - 2 == j) {
                        bw.write("*");
                        break;
                    }
                    else bw.write(" ");
                }
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
