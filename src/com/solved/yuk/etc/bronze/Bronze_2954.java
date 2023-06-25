package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2954 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "), word[], part;
        for(int i = 0; i < input.length; i ++){
            word = input[i].split("");
            for(int j = 0; j < word.length; j ++){
                if((j >= word.length - 2)) {bw.write(word[j]); continue;}
                part = word[j] + word[j+1] + word[j+2];
                if("apa".equals(part) || "epe".equals(part) ||"ipi".equals(part) ||"opo".equals(part) ||"upu".equals(part)) {
                    bw.write(word[j+2]); j+=2;
                } else bw.write(word[j]);
            }
            bw.write(" ");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
