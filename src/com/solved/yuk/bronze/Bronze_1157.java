package com.solved.yuk.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bronze_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        char maxStr = '?';
        for(int i = 0; i < word.length(); i ++) {
            char c = word.charAt(i);
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
            if(map.get(c) > max) {
                max = map.get(c);
                maxStr = c;
            }else if(map.get(c) == max) maxStr = '?';
        }
        System.out.print(maxStr);
    }
}
