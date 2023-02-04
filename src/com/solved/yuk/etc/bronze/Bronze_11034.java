package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_11034 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S;

        //null 값 처리
        while((S = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(S);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            //A부터 B, B부터 C까지의 두 거리중 더 큰 값을 구한다.
            int max = Math.max((B - A - 1), (C - B - 1));

            bw.write(max+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
