package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32306 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int ft = Integer.parseInt(input[0]) + (Integer.parseInt(input[1]) * 2) + (Integer.parseInt(input[2]) * 3);
        input = br.readLine().split(" ");
        int st = Integer.parseInt(input[0]) + (Integer.parseInt(input[1]) * 2) + (Integer.parseInt(input[2]) * 3);
        if(ft > st) bw.write("1");
        else if(ft < st) bw.write("2");
        else bw.write("0");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}