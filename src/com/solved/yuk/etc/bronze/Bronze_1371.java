package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];
        int max = 0;
        String input;
        while ((input = br.readLine()) != null){
            for(int i = 0; i < input.length(); i ++){
                char c = input.charAt(i);
                if(c >= 'a' && c <= 'z'){
                    alphabet[c-'a']++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max,alphabet[i]);
        }

        for (int i = 0; i < 26; i++) {
            if(max == alphabet[i]){
                bw.write((char)(i+'a')+"");
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
}