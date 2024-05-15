package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31798 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        if( a == 0 ) {
            bw.write(c*c - b + "");
        }
        else if( b == 0 ) {
            bw.write(c*c - a + "");
        }
        else if( c == 0 ) {
            bw.write((int)Math.sqrt(a+b)+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
