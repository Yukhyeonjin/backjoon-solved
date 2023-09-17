package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29751 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int W = Integer.parseInt(input[0]),
            H = Integer.parseInt(input[1]);
        bw.write(W*H/2.0+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

