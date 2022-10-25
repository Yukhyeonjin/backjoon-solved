package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int Bx = Integer.parseInt(input[0]),
            By = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int Dx = Integer.parseInt(input[0]),
            Dy = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int Cx = Integer.parseInt(input[0]),
            Cy = Integer.parseInt(input[1]);
        int bessie = 0, daisy = 0;
        bessie = Math.max(Math.abs(Cx - Bx), Math.abs(Cy - By));
        daisy = Math.abs(Cx - Dx) + Math.abs(Cy - Dy);
        bw.write(bessie > daisy ? "daisy" : bessie < daisy ?  "bessie" : "tie");


        bw.flush();
        br.close();
        bw.close();
    }
}
