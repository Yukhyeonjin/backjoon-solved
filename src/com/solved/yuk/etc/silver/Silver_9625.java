package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_9625 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // A -> B -> BA -> BAB -> BABBA -> BABBABAB
        // 10 -> 01  -> 11 -> 12  ->  23  -> 35
        int aCount = 1, bCount = 0, tempACount = 0, tempBCount = 0;
        int K = Integer.parseInt(br.readLine());
        for(int i = 0; i < K; i ++){
            tempACount = bCount;
            tempBCount = aCount + bCount;
            aCount = tempACount;
            bCount = tempBCount;
        }
        bw.write(aCount + " " + bCount);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
