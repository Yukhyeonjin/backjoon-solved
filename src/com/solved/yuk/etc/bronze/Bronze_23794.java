package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23794 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine())+2;
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < N; j ++){
                if(i == 0 || i == N-1 || j == 0 || j == N-1){
                    bw.write("@");
                }else bw.write(" ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
