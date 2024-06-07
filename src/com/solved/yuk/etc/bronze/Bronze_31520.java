package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31520 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if(n == 1) bw.write("1");
        else if(n == 12) bw.write("2");
        else if(n == 123) bw.write("3");
        else if(n == 1234) bw.write("4");
        else if(n == 12345) bw.write("5");
        else if(n == 123456) bw.write("6");
        else if(n == 1234567) bw.write("7");
        else if(n == 12345678) bw.write("8");
        else if(n == 123456789) bw.write("9");
        else if(n == 1234567890) bw.write("0");
        else bw.write("-1");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
