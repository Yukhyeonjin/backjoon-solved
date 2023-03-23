package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21591 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int wC = Integer.parseInt(input[0]),
            hC = Integer.parseInt(input[1]),
            wS = Integer.parseInt(input[2]),
            hS = Integer.parseInt(input[3]);
        if(wC - wS >= 2 && hC - hS >= 2) bw.write("1");
        else bw.write("0");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

