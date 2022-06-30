package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()),
            b = Integer.parseInt(br.readLine()),
            c = Integer.parseInt(br.readLine()),
            d = Integer.parseInt(br.readLine());

        if (a > b && b > c && c > d) {
            bw.write("Fish Diving");
        }
        else if (a < b && b < c && c < d) {
            bw.write("Fish Rising");
        }
        else if (a == b && b == c && c == d) {
            bw.write("Fish At Constant Depth");
        }
        else {
            bw.write("No Fish");
        }



        br.close();
        bw.flush();
        bw.close();
    }
}
