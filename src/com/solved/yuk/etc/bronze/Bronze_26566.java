package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26566 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            String[] input = br.readLine().split(" ");
            int A1 = Integer.parseInt(input[0]);
            int P1 = Integer.parseInt(input[1]);
            input = br.readLine().split(" ");
            int R1 = Integer.parseInt(input[0]);
            int P2 = Integer.parseInt(input[1]);

            double sliced = (double)A1 / P1;
            double whole = (double)(Math.PI * Math.pow(R1, 2)) / P2;

            if (sliced > whole) bw.write("Slice of pizza");
            else bw.write("Whole pizza");
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
