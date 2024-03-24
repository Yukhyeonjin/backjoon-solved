package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25784 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]),
            c = Integer.parseInt(input[2]);
        if(a + b == c || a + c == b || b + c == a) bw.write("1");
        else if(a * b == c || a * c == b || b * c == a) bw.write("2");
        else bw.write("3");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
