package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int xArr[] = new int[4], yArr[] = new int[4];
        for(int i = 0; i < 3; i ++){
            String input[] = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]),
                y = Integer.parseInt(input[1]);
            xArr[i] = x;
            yArr[i] = y;
        }
        bw.write((xArr[0] == xArr[1] ? xArr[2] : xArr[0] == xArr[2] ?  xArr[1] : xArr[0]) + " " + (yArr[0] == yArr[1] ? yArr[2] : yArr[0] == yArr[2] ?  yArr[1] : yArr[0]));

        bw.flush();
        bw.close();
    }
}
