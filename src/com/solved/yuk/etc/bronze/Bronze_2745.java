package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "),
               N = input[0];
        int B = Integer.parseInt(input[1]),
            tmp = 1, ans = 0;

        for(int i = N.length()-1; i >= 0; i --){
            char c = N.charAt(i);
            if('A' <= c && c <= 'Z'){
                ans += (c-'A'+10)*tmp;
            } else {
                ans += (c - '0') * tmp;
            }
            tmp *= B;
        }
        bw.write(ans+"");

        bw.flush();
        bw.close();
    }
}