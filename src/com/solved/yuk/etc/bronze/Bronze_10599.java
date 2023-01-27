package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10599 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if("0 0 0 0".equals(input)) break;
            String arr[] = input.split(" ");
            int a = Integer.parseInt(arr[0]),
                b = Integer.parseInt(arr[1]),
                c = Integer.parseInt(arr[2]),
                d = Integer.parseInt(arr[3]);
            bw.write(Math.abs(c - b) + " " + Math.abs(d - a)+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
