package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30314 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String first = br.readLine(),
               second = br.readLine();

        int sum = 0;
        int zNum = 'Z' - 'A' + 1;
        int fNum, sNum;
        for (int i = 0; i < n; i ++){
            fNum = Math.max(first.charAt(i),second.charAt(i)) - 'A' + 1;
            sNum = Math.min(first.charAt(i),second.charAt(i)) - 'A' + 1;
            int x = fNum - sNum;
            int y = zNum + sNum - fNum;
            sum += Math.min(x, y);
        }
        bw.write(sum+"");


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}