package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28453 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());
        String input[] = br.readLine().split(" ");
        for (int i = 0; i < N; i ++){
            int M = Integer.parseInt(input[i]);
            if(M == 300) bw.write("1");
            else if(M >= 275) bw.write("2");
            else if(M >= 250) bw.write("3");
            else bw.write("4");
            if(i != N-1) bw.write(" ");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
