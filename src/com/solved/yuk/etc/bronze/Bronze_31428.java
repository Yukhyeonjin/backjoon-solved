package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31428 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] friends = br.readLine().split(" ");
        String bitTrack = br.readLine();
        int count = 0;
        for(int i = 0; i < N; i ++){
            if(bitTrack.equals(friends[i])) count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}