package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27267 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]),
            c = Integer.parseInt(input[2]),
            d = Integer.parseInt(input[3]);
        int masha = a*b, petya = c*d;
        bw.write(masha > petya ? "M" : masha < petya ? "P" : "E");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

