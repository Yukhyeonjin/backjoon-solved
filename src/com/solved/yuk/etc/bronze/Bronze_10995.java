package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10995 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            for(int j = 0; j < 2*n; j++){
                if((i-j)%2==0)bw.write("*");
                else bw.write(" ");
            }
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }
}