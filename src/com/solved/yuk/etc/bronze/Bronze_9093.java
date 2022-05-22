package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input[] = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                String word[] = input[j].split("");
                for (int k = word.length - 1; k >= 0; k--) {
                    bw.write(word[k]);
                }
                bw.write(" ");
            }
            bw.newLine();
        }


        bw.flush();
        bw.close();

    }
}
