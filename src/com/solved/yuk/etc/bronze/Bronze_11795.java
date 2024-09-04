package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bronze_11795 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int setA = 0, setB = 0, setC = 0;
        for (int i = 0; i < T; i ++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            setA += a;
            setB += b;
            setC += c;

            int packages = Math.min(Math.min(setA, setB), setC);
            if (packages < 30) bw.write("NO\n");
            else {
                bw.write(packages+"\n");
                setA -= packages;
                setB -= packages;
                setC -= packages;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}