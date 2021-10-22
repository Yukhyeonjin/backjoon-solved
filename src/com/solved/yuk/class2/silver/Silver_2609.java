package com.solved.yuk.class2.silver;

import java.io.*;

public class Silver_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
                B = Integer.parseInt(input[1]);
        int gcd = gcd(A,B);
        bw.write(gcd + "\n");
        bw.write(A*B/gcd + "");

        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
