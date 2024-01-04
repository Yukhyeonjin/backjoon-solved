package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30979 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()),
            N = Integer.parseInt(br.readLine()) , F =0;
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            F += Integer.parseInt(input[i]);
        }
        if(T <= F) bw.write("Padaeng_i Happy");
        else bw.write("Padaeng_i Cry");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

