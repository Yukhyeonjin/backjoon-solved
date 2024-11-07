package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32260 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        bw.write(sum(A,B)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static int sum(int A, int B) {
        return A + B;
    }
    public static void main(String[] args) throws Exception {
        solution();
    }
}
