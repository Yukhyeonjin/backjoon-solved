package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16546 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        int x = 0, y = 0;
        for (int i = 0; i < N; i++) {
            x += (i+1);
            if(i != N-1) {
                y += Integer.parseInt(input[i]);
            }
        }
        bw.write(x-y+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

