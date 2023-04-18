package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27262 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]),
            k = Integer.parseInt(input[1]),
            a = Integer.parseInt(input[2]),
            b = Integer.parseInt(input[3]);
        bw.write( (((k-1)*b)+((n-1)*b)) + " " + ((n-1)*a) );

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

