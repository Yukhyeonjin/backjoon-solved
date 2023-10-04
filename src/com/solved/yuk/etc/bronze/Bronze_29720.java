package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29720 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]),
            K = Integer.parseInt(input[2]), min = 0, max = 0;
        min = N - M * K > 0 ? N - M * K : 0;
        max = N - M * (K - 1) - 1;
        bw.write(min +" " + max);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

