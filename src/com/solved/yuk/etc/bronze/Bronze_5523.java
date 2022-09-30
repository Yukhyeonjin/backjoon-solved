package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), aWin = 0, bWin = 0;

        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
            if(a > b) aWin++;
            else if(a < b) bWin++;
        }
        bw.write(aWin + " " + bWin);


        bw.flush();
        br.close();
        bw.close();
    }
}
