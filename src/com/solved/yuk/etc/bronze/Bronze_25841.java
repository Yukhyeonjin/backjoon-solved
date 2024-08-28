package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25841 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int cnt = 0;
        for (int i = x; i <= y; i++){
            for (int j = 0; j < 4; j++){
                if(input[2].equals(String.valueOf(i).split("")[j])) cnt++;
            }
        }
        bw.write(cnt+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
