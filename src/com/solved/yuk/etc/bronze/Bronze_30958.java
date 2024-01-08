package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_30958 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        int ch[] = new int[26];
        String input = br.readLine();
        char c;
        for(int i = 0; i < input.length(); i ++){
            c = input.charAt(i);
            if(c >= 'a' && c <= 'z') ch[(int)(c) - 'a']++;
        }
        Arrays.sort(ch);
        bw.write(ch[25]+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

