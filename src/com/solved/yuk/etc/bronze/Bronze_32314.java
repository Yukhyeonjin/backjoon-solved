package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32314 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int v = Integer.parseInt(input[1]);
        if(w >= a*v) bw.write("1");
        else bw.write("0");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}