package com.solved.yuk.etc.gold;

import java.io.*;

public class Gold_11758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x1 = Integer.parseInt(input[0]) , y1 = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int x2 = Integer.parseInt(input[0]) , y2 = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int x3 = Integer.parseInt(input[0]) , y3 = Integer.parseInt(input[1]);

        int ccw = ccw(x1, y1, x2, y2, x3, y3);
        if(ccw == 0) bw.write("0");
        if(ccw >= 1) bw.write("1");
        if(ccw <= -1) bw.write("-1");


        bw.flush();
        br.close();
        bw.close();
    }

    public static int ccw(int x1, int y1, int x2, int y2, int x3, int y3){
        return  (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
    }
}
