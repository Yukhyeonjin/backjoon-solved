package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bronze_25915 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        int str = s.charAt(0);
        int i = "I".charAt(0);
        
        System.out.println((Math.abs(str-i)+84));
    }

    public static void main(String[] args) throws Exception {
        new Bronze_25915().solution();
    }
}
