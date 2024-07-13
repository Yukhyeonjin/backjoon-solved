package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24084 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for (int i = 0; i < N-1; i++){
            if(S.charAt(i+1) == 'J') bw.write(String.valueOf(S.charAt(i))+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

