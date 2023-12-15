package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26145 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]), s[] = new int[N+M];
        input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            s[i] = Integer.parseInt(input[i]);
        }
        int money;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            for(int j = 0; j < N+M; j ++){
                money = Integer.parseInt(input[j]);
                s[j] += money;
                s[i] -= money;
            }
        }
        for(int i = 0; i < N+M; i ++){
            bw.write(s[i]+" ");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

