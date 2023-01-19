package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            L = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int fruit[] = new int[N];
        for(int i = 0; i < N; i++){
            fruit[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(fruit);
        for(int i = 0; i < N; i++){
            if(L >= fruit[i]) L++;
        }
        bw.write(L+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
