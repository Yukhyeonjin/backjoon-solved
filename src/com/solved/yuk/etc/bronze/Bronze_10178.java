package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_10178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write("You get " + (A / B) + " piece(s) and your dad gets " + (A % B) + " piece(s).\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
