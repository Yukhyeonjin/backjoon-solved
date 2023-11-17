package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16561 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), sum = 1, count = 2;
        for(int i = 9; i < N; i +=3 ){
            sum += count;
            count += 1;
        }
        bw.write(sum+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
