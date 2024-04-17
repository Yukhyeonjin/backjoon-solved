package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31628 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr[][] = new String[10][10];
        String input[];
        for (int i = 0; i < 10; i ++){
            input = br.readLine().split(" ");
            for (int j = 0; j < 10; j ++){
                arr[i][j] = input[j];
            }
        }
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            boolean able = true;
            for (int j = 1; j < 10; j++) {
                if (!arr[i][j].equals(arr[i][0])) {
                    able = false;
                }
            }
            if (able) {
                flag = true;
                break;
            }
        }
        for (int j = 0; j < 10; j++) {
            boolean able = true;
            for (int i = 1; i < 10; i++) {
                if (!arr[i][j].equals(arr[0][j])) {
                    able = false;
                }
            }
            if (able) {
                flag = true;
                break;
            }
        }
        if(flag) bw.write("1");
        else bw.write("0");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
