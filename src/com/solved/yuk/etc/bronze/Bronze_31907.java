package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31907 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[][] arr = {{"G",".",".","."}, {".","I",".","T"}, {".",".","S","."}};
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < T; j++) {
                for(int k = 0; k < arr[0].length; k++) {
                    for (int l = 0; l < T; l++) {
                        bw.write(arr[i][k]);
                    }
                }
                bw.newLine();
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
