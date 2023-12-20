package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26531 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        if(Integer.parseInt(input[0]) + Integer.parseInt(input[2]) == Integer.parseInt(input[4])) bw.write("YES");
        else bw.write("NO");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

