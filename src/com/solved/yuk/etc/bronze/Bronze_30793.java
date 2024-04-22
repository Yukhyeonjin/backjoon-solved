package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30793 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        if( a / b < 0.2) bw.write("weak");
        else if( a / b < 0.4) bw.write("normal");
        else if( a / b < 0.6) bw.write("strong");
        else bw.write("very strong");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
