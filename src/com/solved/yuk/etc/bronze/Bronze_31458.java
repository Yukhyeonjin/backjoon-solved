package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31458 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 0! = 1, 1! = 1
        // !0 = 1, !1 = 0
        int T = Integer.parseInt(br.readLine()), a, n, b;
        String input;
        for(int i = 0; i < T; i ++){
            input = br.readLine();
            a = 0; n = 2; b = 0;
            for(int j = 0; j < input.length(); j ++){
                if(input.charAt(j) == '!' && n == 2) a++;
                else if(input.charAt(j) == '!' && n != 2) b++;
                else n = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
            if(b > 0) n = 1;

            if(n == 1 && a % 2 != 0) n = 0;
            else if(n == 1) n = 1;
            else if(n == 0 && a % 2 != 0) n = 1;
            else if(n == 0) n = 0;

            bw.write(n+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}