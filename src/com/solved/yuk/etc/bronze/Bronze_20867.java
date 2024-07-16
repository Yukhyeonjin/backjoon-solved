package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20867 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        double m = Double.parseDouble(input[0]);
        double s = Double.parseDouble(input[1]);
        double g = Double.parseDouble(input[2]);
        input = br.readLine().split(" ");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        input = br.readLine().split(" ");
        double l = Double.parseDouble(input[0]);
        double r = Double.parseDouble(input[1]);

        double friskus = (1 / a) * l + m / g;
        double latmask = (1 / b) * r + m / s;
        if (friskus < latmask) bw.write("friskus");
        else bw.write("latmask");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

