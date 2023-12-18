package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26004 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
        h = 0, i = 0, a = 0, r = 0, c = 0;
        String S = br.readLine(), ch;
        for(int j = 0; j < S.length(); j ++){
            ch = String.valueOf(S.charAt(j));
            if("H".equals(ch)) h++;
            else if("I".equals(ch)) i++;
            else if("A".equals(ch)) a++;
            else if("R".equals(ch)) r++;
            else if("C".equals(ch)) c++;
        }
        int min = Math.min(h, Math.min(i, Math.min(a, Math.min(r, c))));
        bw.write(min+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

