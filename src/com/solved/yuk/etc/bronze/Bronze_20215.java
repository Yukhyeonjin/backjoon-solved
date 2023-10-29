package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20215 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int w = Integer.parseInt(input[0]),
            h = Integer.parseInt(input[1]);
        bw.write((2*(w+h))-(Math.sqrt(w*w+h*h)+w+h)+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

