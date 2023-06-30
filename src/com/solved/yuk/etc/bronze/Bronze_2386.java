package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_2386 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, alphabet, sentence;
        while (!"#".equals(input = br.readLine())){
            alphabet = String.valueOf(input.charAt(0));
            sentence = input.substring(2,input.length());
            bw.write(alphabet + " " + (sentence.length() - sentence.toLowerCase().replaceAll(alphabet,"").length())+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
