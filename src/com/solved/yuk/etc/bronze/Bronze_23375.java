package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23375 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x =  Integer.parseInt(input[0]);
        int y =  Integer.parseInt(input[1]);
        int r =  Integer.parseInt(br.readLine());

        bw.write((x-r) + " " + (y+r)+"\n");
        bw.write((x+r) + " " + (y+r)+"\n");
        bw.write((x+r) + " " + (y-r)+"\n");
        bw.write((x-r) + " " + (y-r)+"\n");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}