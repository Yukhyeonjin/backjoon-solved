package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1373 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String N = br.readLine();

        // 세자리씩 끊었을 때 한 자리만 남았을 경우
        if(N.length() % 3 == 1)
            sb.append(N.charAt(0));

        // 세자리씩 끊었을 때 두 자리만 남았을 경우
        if(N.length() % 3 == 2)
            sb.append((N.charAt(0) - '0') * 2 + (N.charAt(1) - '0'));

        // 나머지 경우
        for(int i = N.length() % 3; i < N.length(); i+=3) {
            sb.append((N.charAt(i) - '0') * 4 + (N.charAt(i+1) - '0') * 2
                    + (N.charAt(i+2) - '0'));
        }
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
