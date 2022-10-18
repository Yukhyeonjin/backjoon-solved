package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10474 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!("0 0").equals(input = br.readLine())){
            int n = Integer.parseInt(input.split(" ")[0]),
                d = Integer.parseInt(input.split(" ")[1]);
            bw.write(n / d + " " + n % d + " / " + d + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
