package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Bronze_3059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n; i ++){
            String input = br.readLine();
            int sum = 0;
            set.clear();
            for(int j = 0; j < input.length(); j ++){
                char c = input.charAt(j);
                if(!set.contains(c)) set.add(c);
            }
            for(int j = (int)'A'; j <= (int)'Z'; j ++){
                char c = (char)j;
                if(!set.contains(c)) sum+=j;
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
