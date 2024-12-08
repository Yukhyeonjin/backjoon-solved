package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32905 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        boolean flag = true;
        for (int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            int aCnt = 0;
            for (int j = 0; j < m; j ++){
                if(input[j].equals("A")) aCnt++;
            }
            if(aCnt != 1) {
                flag = false;
                break;
            }
        }
        if(flag) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}