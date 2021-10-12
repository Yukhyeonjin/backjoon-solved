package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]);
        bw.write(((A+B)%C)+"\n");
        bw.write((((A%C) + (B%C))%C)+"\n");
        bw.write(((A*B)%C)+"\n");
        bw.write((((A%C)*(B%C))%C)+"");

        bw.flush();
        bw.close();

    }
}
