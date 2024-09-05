package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15178 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++){
            String[] input = br.readLine().split(" ");
            int angle_1 = Integer.parseInt(input[0]);
            int angle_2 = Integer.parseInt(input[1]);
            int angle_3 = Integer.parseInt(input[2]);
            if (angle_1 + angle_2 + angle_3 == 180) {
                bw.write(angle_1 + " " + angle_2 + " " +  angle_3 + " Seems OK");
                bw.newLine();
            }
            else {
                bw.write(angle_1 + " " + angle_2 + " " +  angle_3 + " Check");
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
