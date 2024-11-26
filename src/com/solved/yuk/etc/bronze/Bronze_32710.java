package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32710 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean flag = false;
        for(int i = 1; i <= 9; i++){
            if(flag) break;
            for(int j = 1; j <= 9; j++){
                if(i * j == N) {
                    flag = true;
                    break;
                }
            }
        }
        if(flag) bw.write("1");
        else if(N >= 1 && N <= 9) bw.write("1");
        else bw.write("0");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
