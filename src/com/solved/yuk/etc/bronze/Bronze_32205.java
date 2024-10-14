package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32205 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int count = a * b;
        count = count % 12 > 0 ? count / 12 + 1 : count / 12;
        int d = Integer.parseInt(br.readLine());
        bw.write(count * d + "");


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}