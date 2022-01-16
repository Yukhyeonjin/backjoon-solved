package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] 간달프 = {1, 2, 3, 3, 4, 10},
                사우론 = {1, 2, 2, 2, 3, 5, 10};
        int T = Integer.parseInt(br.readLine()),
                간달프합, 사우론합;
        String[] input;
        for (int i = 0; i < T; i++) {
            간달프합 = 사우론합 = 0;

            input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                간달프합 = 간달프합 + (Integer.parseInt(input[j]) * 간달프[j]);
            }

            input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                사우론합 = 사우론합 + (Integer.parseInt(input[j]) * 사우론[j]);
            }

            if (간달프합 > 사우론합) bw.write("Battle "+(i+1)+": Good triumphs over Evil\n");
            else if (간달프합 == 사우론합) bw.write("Battle "+(i+1)+": No victor on this battle field\n");
            else bw.write("Battle "+(i+1)+": Evil eradicates all trace of Good\n");

        }

        bw.flush();
        bw.close();
    }
}
