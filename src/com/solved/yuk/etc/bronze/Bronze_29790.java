package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29790 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            U = Integer.parseInt(input[1]),
            L = Integer.parseInt(input[2]);
        if(N >= 1000 && (U >= 8000 || L >= 260)) bw.write("Very Good");
        else if(N >= 1000) bw.write("Good");
        else bw.write("Bad");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

