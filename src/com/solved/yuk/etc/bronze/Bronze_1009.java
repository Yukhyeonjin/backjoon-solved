package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 1, 2 4 8 6, 3 9 7 1, 4 6, 5, 6, 7 9 3 1, 8 4 2 6, 9 1, 10
        int T = Integer.parseInt(br.readLine()); // 테스트케이스
        String[] input; int a;int b;
        for(int i = 0; i < T; i ++){
            input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1])%4;
            b = b == 0 ? 4 : b;
            int mod = Math.pow(a,b)%10 == 0 ? 10 : (int)Math.pow(a,b)%10;
            bw.write(mod + "\n");
        }

        bw.flush();
        bw.close();
    }
}
