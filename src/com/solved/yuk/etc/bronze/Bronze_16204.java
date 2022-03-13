package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), // 전체 카드의 수
            O = Integer.parseInt(input[1]), // 앞이 O인 카드
            X = N - O,                      // 앞이 X인 카드
            o = Integer.parseInt(input[2]), // 카드 뒷면에 적을 O의 수
            x = N - o;                      // 카드 뒷면에 적을 X의 수
        int maxO = 0, maxX = 0;
        if(O > o) maxO = o;
        else maxO = O;
        if(X > x) maxX = x;
        else maxX = X;
        bw.write(maxO+maxX+"");

        bw.flush();
        bw.close();
    }
}
