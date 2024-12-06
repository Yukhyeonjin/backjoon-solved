package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32777 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Q = Integer.parseInt(br.readLine()), a, b, innerCnt, outerCnt;
        String[] input;
        for (int i = 0; i < Q; i++) {
            input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            int j = a;
            innerCnt = 0;
            while (true) {
                j++;
                innerCnt++;
                if(j==244) j = 201;
                if(j == b) break;
            }
            j = a;
            outerCnt = 0;
            while (true) {
                j--;
                outerCnt++;
                if(j==200) j = 243;
                if(j == b) break;
            }
            if(innerCnt < outerCnt) bw.write("Inner circle line");
            else if(innerCnt > outerCnt) bw.write("Outer circle line");
            else bw.write("same");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
