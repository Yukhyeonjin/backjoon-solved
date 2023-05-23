package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28113 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            A = Integer.parseInt(input[1]),
            B = Integer.parseInt(input[2]);
        if(A < (N + B-N)) bw.write("Bus");
        else if(A > (N + B-N)) bw.write("Subway");
        else bw.write("Anything");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

