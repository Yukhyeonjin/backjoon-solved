package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21197 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if(N % 2 == 1) bw.write("still running");
        else {
            int sum = 0;
            for (int i = 0; i < N; ){
                int x =Integer.parseInt(br.readLine());
                int y = Integer.parseInt(br.readLine()) - x;
                sum += y;
                i+=2;
            }
            bw.write(sum+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}