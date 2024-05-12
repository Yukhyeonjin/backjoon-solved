package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21633 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double k = Double.parseDouble(br.readLine());
        double tugriks = 25.0 + (k*0.01);
        if(tugriks <= 100) bw.write("100.00");
        else if (tugriks >= 2000) bw.write("2000.00");
        else bw.write(String.format("%.2f", tugriks));

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
