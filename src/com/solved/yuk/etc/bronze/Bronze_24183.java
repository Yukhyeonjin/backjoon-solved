package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24183 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        double  a = Double.parseDouble(input[0]),
                b = Double.parseDouble(input[1]),
                c = Double.parseDouble(input[2]);
        double envelop = 229 * 324 * a * 2;
        double poster = 297 * 420 * b * 2;
        double sheet = 210 * 297 * c;
        bw.write(String.format("%.6f", (envelop + poster + sheet) * 0.000001));


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
