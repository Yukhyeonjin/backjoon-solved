package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31518 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), sevenCount = 0;
        String input[];
        boolean flag = true;
        for (int i = 0; i < 3; i ++) {
            input = br.readLine().split(" ");
            sevenCount = 0;
            for (int j = 0; j < n; j ++) {
                if( 7 == Integer.parseInt(input[j])) {
                    sevenCount++;
                }
            }
            if(sevenCount == 0) flag = false;
            if(!flag) break;
        }
        if(flag) bw.write("777");
        else bw.write("0");
        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
