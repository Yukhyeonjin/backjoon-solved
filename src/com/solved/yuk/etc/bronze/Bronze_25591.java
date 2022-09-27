package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]);
        int a = 100 - x, b = 100 - y, c = 100 - (a+b), d = a * b, q = d / 100, r = d % 100;
        bw.write(a + " " + b + " " + c + " " + d + " " + q + " " + r + "\n");
        if(d > 100) bw.write(c+q + " " + r);
        else bw.write(c + " " + d);

        bw.flush();
        br.close();
        bw.close();
    }
}
