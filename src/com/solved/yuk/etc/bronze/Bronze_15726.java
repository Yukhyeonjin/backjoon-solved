package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15726 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        double a = Double.parseDouble(input[0]),
               b = Double.parseDouble(input[1]),
               c = Double.parseDouble(input[2]);
        int x = (int) ((a * b) / c),
            y = (int) ((a / b) * c);
        if (x > y) bw.write(x + "");
        else bw.write(y + "");

        bw.flush();
        bw.close();
    }
}
