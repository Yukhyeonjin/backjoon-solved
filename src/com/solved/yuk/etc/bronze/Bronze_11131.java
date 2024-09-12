package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11131 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++){
            int nMass = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int totalSum = 0;
            for (int m = 0; m < nMass; m++) {
                totalSum += Integer.parseInt(input[m]);
            }

            if (totalSum == 0) {
                bw.write("Equilibrium");
            }
            else if (totalSum > 0) {
                bw.write("Right");
            }
            else {
                bw.write("Left");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}