package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31282 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]),
            K = Integer.parseInt(input[2]);
        int count = 0, rabbit = N, dog = 0;
        while (true) {
            count++;
            rabbit += M;
            dog += K;
            if(dog >= rabbit) break;
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