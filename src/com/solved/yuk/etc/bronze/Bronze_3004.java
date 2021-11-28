package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //1 2 4 6 9 12 16 20 25
        // 1 2 2 3 3  4  4  5  5
        //0 1 2 3 4  5  6  7  8
        int N = Integer.parseInt(br.readLine());
        int sum = 1;
        for(int i =1; i <= N; i++){
           sum += i/2+1;
        }
        bw.write(sum +"");

        bw.flush();
        bw.close();

    }
}
